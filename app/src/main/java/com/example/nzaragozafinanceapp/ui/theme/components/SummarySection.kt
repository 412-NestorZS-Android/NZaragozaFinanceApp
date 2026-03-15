package com.example.nzaragozafinanceapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nzaragozafinanceapp.model.SummaryCard

@Composable
fun SummarySection(cards: List<SummaryCard>) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
    ) {

        SummaryCardItem(
            title = cards[0].title,
            amount = cards[0].amount,
            color = cards[0].color,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {

            SummaryCardItem(
                title = cards[1].title,
                amount = cards[1].amount,
                color = cards[1].color,
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.height(12.dp))

            SummaryCardItem(
                title = cards[2].title,
                amount = cards[2].amount,
                color = cards[2].color,
                modifier = Modifier.weight(1f)
            )
        }
    }
}