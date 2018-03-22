package io.nefari0uss.grocerylist

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val reqCode: Int = 100

    companion object {
        var items: MutableList<Item> = mutableListOf()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        items.add(Item(name = "Milk" , count = 2 ))
        items.add(Item(name = "Crackers" , count = 1 ))
        items.add(Item(name = "Apple" , count = 5 ))

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemsButton.setOnClickListener{ onItemsClick() }
        addItemsButton.setOnClickListener{ onAddItemClick() }
        aboutButton.setOnClickListener{ onAboutClick() }
    }

    private fun onItemsClick() {
        val intent = Intent(this, ItemsActivity::class.java)
        startActivity(intent)
    }

    private fun onAddItemClick() {
        val intent = Intent(this, AddItemActivity::class.java)
        startActivityForResult(intent, reqCode)
    }

    private fun onAboutClick() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, result: Int, data: Intent?) {
        if (requestCode == reqCode && result == Activity.RESULT_OK) {
            val name: String = data?.getStringExtra("ItemName") as String
            val count: Long = data.getIntExtra("ItemCount", -1).toLong()
            items.add(Item(name = name, count = count))
        }
    }
}
