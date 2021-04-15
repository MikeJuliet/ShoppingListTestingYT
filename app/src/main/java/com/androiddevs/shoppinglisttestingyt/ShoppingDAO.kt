package com.androiddevs.shoppinglisttestingyt

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Created by mj on 2021/04/15 at 5:38 PM
 */
interface ShoppingDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    @Delete
    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    @Query("select * from shoppingItems")
    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    @Query("select sum(price * amount) from shoppingItems")
    fun observeTotalPrice(): LiveData<Float>
}