package com.example.shoppingapplication.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingapplication.data.ShopListRepositoryImpl
import com.example.shoppingapplication.domain.DeleteShopItemUseCase
import com.example.shoppingapplication.domain.EditShopItemUseCase
import com.example.shoppingapplication.domain.GetShopListUseCase
import com.example.shoppingapplication.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository: ShopListRepositoryImpl = ShopListRepositoryImpl

//    private val shopList: LiveData<List<ShopItem>> = _liveData

    private val getShopListUseCase: GetShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase: DeleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase: EditShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

}