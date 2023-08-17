package com.example.shoppingapplication.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopList() : LiveData<List<ShopItem>>

    fun getShopItemById(id: Int): ShopItem

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)
}