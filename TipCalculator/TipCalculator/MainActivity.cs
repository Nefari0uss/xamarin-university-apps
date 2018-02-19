using System;
using Android.App;
using Android.Widget;
using Android.OS;

namespace TipCalculator
{
    [Activity(Label = "Tip Calculator", MainLauncher = true, Icon = "@mipmap/icon")]
    public class MainActivity : Activity
    {
        private EditText _inputBill;
        private Button _calculateButton;
        private TextView _outputTip;
        private TextView _outputTotal;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            _inputBill = FindViewById<EditText>(Resource.Id.inputBill);
            _calculateButton = FindViewById<Button>(Resource.Id.calculateButton);
            _outputTip = FindViewById<TextView>(Resource.Id.outputTip);
            _outputTotal = FindViewById<TextView>(Resource.Id.outputTotal);



            _calculateButton.Click += OnCalculateClick;
        }

        private void OnCalculateClick(object sender, EventArgs e)
        {
            String text = _inputBill.Text;
            var bill = double.Parse(text);

            var tip = bill * 0.15;
            var total = bill + tip;


            _outputTip.Text = tip.ToString();
            _outputTotal.Text = total.ToString();
        }
    }
}

