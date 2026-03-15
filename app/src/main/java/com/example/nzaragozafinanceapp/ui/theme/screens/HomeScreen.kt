package com.example.nzaragozafinanceapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nzaragozafinanceapp.data.DummyData
import com.example.nzaragozafinanceapp.ui.theme.components.HeaderSection
import com.example.nzaragozafinanceapp.ui.theme.components.SummarySection

@Composable
fun HomeScreen() {

    val user = DummyData.user
    val cards = DummyData.summaryCards

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        HeaderSection(user.name)

        Spacer(modifier = Modifier.height(20.dp))

        SummarySection(cards)

        Spacer(modifier = Modifier.height(20.dp))

    }
}