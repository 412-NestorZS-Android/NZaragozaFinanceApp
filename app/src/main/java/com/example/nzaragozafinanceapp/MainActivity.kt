package com.example.nzaragozafinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.nzaragozafinanceapp.ui.theme.NZaragozaFinanceAppTheme
import com.example.nzaragozafinanceapp.ui.theme.screens.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            NZaragozaFinanceAppTheme {
                HomeScreen()
            }

        }
    }
}