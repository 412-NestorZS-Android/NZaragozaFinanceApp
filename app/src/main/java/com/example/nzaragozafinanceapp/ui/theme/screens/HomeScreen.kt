package com.example.nzaragozafinanceapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nzaragozafinanceapp.data.DummyData
import com.example.nzaragozafinanceapp.ui.theme.components.HeaderSection

@Composable
fun HomeScreen() {

    val user = DummyData.user

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        HeaderSection(user.name)

        Spacer(modifier = Modifier.height(20.dp))

    }
}