package com.example.shoppingapplication.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.data.ShopListRepositoryImpl
import com.example.shoppingapplication.domain.DeleteSHopItemUseCase
import com.example.shoppingapplication.domain.EditShopItemUseCase
import com.example.shoppingapplication.domain.GetShopListUseCase
import com.example.shoppingapplication.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository : ShopListRepositoryImpl = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteSHopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)

    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }

}