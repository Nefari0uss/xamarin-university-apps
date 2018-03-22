package io.nefari0uss.grocerylist

data class Item(var name: String, var count: Long) {

    override fun toString(): String = name
}
