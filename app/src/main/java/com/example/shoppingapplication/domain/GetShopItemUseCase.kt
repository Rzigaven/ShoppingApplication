package com.example.shoppingapplication.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemById(id: Int): ShopItem {
        return shopListRepository.getShopItemById(id)
    }
}