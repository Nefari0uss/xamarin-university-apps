package io.nefari0uss.grocerylist

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_item.*

class AddItemActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        saveButton.setOnClickListener{ onSaveClick() }
        cancelButton.setOnClickListener{ onCancelClick() }
    }

    private fun onSaveClick() {
        val name: String = nameInput.text.toString()
        val count: Int = countInput.text.toString().toInt()

        val intent = Intent()
        intent.putExtra("ItemName", name)
        intent.putExtra("ItemCount", count)

        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    private fun onCancelClick() {
        finish()
    }
}
