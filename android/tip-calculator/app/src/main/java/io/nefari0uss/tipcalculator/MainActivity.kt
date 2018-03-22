package io.nefari0uss.tipcalculator

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import io.nefari0uss.tipcalculator.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton.setOnClickListener { view ->
            onSubmitClicked()
        }

    }

    fun onSubmitClicked() {
        val amount = userInput.text.toString().toDouble()
        val tip = amount * 0.15
        val total = amount + tip

        tipAmount.text = tip.toString()
        totalAmount.text = total.toString()
    }
}
