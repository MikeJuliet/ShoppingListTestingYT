package com.androiddevs.shoppinglisttestingyt

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by mj on 2021/04/15 at 5:33 PM
 */
@Entity(tableName = "shoppingItems")
data class ShoppingItem(
    var name:String,
    var amount:Int,
    var price:Float,
    var imageUrl:String,
    @PrimaryKey(autoGenerate = true)
    val id:Int
)
