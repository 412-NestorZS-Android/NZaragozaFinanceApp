package com.example.nzaragozafinanceapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nzaragozafinanceapp.data.DummyData
import com.example.nzaragozafinanceapp.ui.theme.components.HeaderSection
import com.example.nzaragozafinanceapp.ui.theme.components.SummarySection
import com.example.nzaragozafinanceapp.ui.theme.components.TransactionSection

@Composable
fun HomeScreen() {

    val user = DummyData.user
    val cards = DummyData.summaryCards
    val transactions = DummyData.transactions

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 16.dp)
    ) {

        HeaderSection(name = user.name)

        Spacer(modifier = Modifier.height(24.dp))

        SummarySection(cards)

        Spacer(modifier = Modifier.height(24.dp))

        TransactionSection(transactions)
    }
}