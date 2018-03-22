package io.nefari0uss.grocerylist

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_item_details.*

class ItemDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)

        val position: Int = intent.getIntExtra("ItemPosition", -1)
        val item: Item = MainActivity.Companion.items[position]

        detailsNameTV.text = "Name" + item.name
        detailsCountTV.text = "Count: " + item.count.toString()
    }
}
