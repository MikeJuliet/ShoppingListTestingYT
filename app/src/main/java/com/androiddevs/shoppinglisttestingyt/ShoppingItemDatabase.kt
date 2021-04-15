package com.androiddevs.shoppinglisttestingyt

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by mj on 2021/04/15 at 5:41 PM
 */
@Database(entities = [ShoppingItem::class], version = 1)
abstract class ShoppingItemDatabase : RoomDatabase() {
    abstract fun shoppingItemDAO(): ShoppingDAO
}