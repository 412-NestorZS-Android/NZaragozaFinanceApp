package com.example.nzaragozafinanceapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SummaryCardItem(
    title: String,
    amount: Double,
    color: Color,
    modifier: Modifier = Modifier,
    showIcon: Boolean = false
) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            if (showIcon) {

                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "actividad"
                )

                Spacer(modifier = Modifier.height(8.dp))
            }

            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            if (title == "Actividad") {

                Text(
                    text = "de la Semana",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            } else {

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "$$amount",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        }
    }
}