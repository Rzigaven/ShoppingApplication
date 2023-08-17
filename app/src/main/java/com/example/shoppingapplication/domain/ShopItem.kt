package com.example.shoppingapplication.domain

data class ShopItem(
    private val id: Int,
    private val name: String,
    private val count: Int,
    private val enabled: Boolean
)
