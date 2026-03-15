package com.example.nzaragozafinanceapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nzaragozafinanceapp.model.Transaction

@Composable
fun TransactionSection(transactions: List<Transaction>) {

    Column {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(text = "Transactions")

            Text(text = "See All")
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {

            items(transactions) { transaction ->

                TransactionItem(transaction)
            }
        }
    }
}