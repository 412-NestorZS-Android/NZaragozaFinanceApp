package com.example.nzaragozafinanceapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.Color
import com.example.nzaragozafinanceapp.model.*

object DummyData {

    val user = User("Ness", 1200.00)

    val summaryCards = listOf(
        SummaryCard("Actividad", 0.0, Color(0xFFD6E4E5)),
        SummaryCard("Ventas", 280.99, Color(0xFFE9D7C8)),
        SummaryCard("Ganancias", 280.99, Color(0xFFD9D3F0))
    )

    val transactions = listOf(
        Transaction("Supermarket","Groceries",45.99,"10:30 AM", Icons.Default.ShoppingCart),
        Transaction("Gas Station","Fuel",-30.5,"12:15 PM", Icons.Default.ShoppingCart),
        Transaction("Coffee Shop","Food & Drinks",5.75,"8:00 AM", Icons.Default.ShoppingCart),
        Transaction("Electronics Store","Electronics",120.0,"3:45 PM", Icons.Default.ShoppingCart),
        Transaction("Bookstore","Books",25.99,"2:00 PM", Icons.Default.ShoppingCart),
        Transaction("Restaurant","Dining",60.0,"7:30 PM", Icons.Default.ShoppingCart)
    )
}