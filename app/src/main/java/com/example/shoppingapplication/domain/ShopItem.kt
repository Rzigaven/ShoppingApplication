package com.example.shoppingapplication.domain

data class ShopItem(
    private val name: String,
    private val count: Int,
    private val enabled: Boolean,
    var id: Int = UNDEFINED_ID
    )
{
    companion object {
        const val UNDEFINED_ID = -1
    }
}
