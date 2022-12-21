package com.example.pizzatime

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow(item_info: Item) {

    Spacer(modifier = Modifier.height(10.dp))

    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Text(text = item_info.item_name, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(0.5f))

        Text(text = item_info.item_cost.toString(), textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(0.5f))
    }
}