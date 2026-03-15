package com.example.nzaragozafinanceapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HeaderSection(name: String) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {

            Text(
                text = "Hola $name",
                fontSize = 22.sp
            )

            Text(
                text = "Bienvenido",
                fontSize = 14.sp
            )
        }

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu"
            )
        }
    }
}