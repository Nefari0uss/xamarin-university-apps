package io.nefari0uss.grocerylist

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_items.*

class ItemsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        itemsList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, MainActivity.Companion.items)
        itemsList.setOnItemClickListener { parent, view, position, id -> showItem(position) }
    }

    private fun showItem(position: Int) {
        val intent = Intent(this, ItemDetailActivity::class.java)
        intent.putExtra("ItemPosition", position)
        startActivity(intent)
    }
}

