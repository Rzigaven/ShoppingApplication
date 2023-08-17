package com.example.shoppingapplication.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList() : List<ShopItem> {
        return shopListRepository.getShopList()
    }
}