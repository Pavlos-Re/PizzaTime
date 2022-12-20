package com.example.pizzatime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pizzatime.ui.theme.PizzaTimeTheme
import java.io.Serializable

class Order : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val itemList = intent.getSerializableExtra("list") as ArrayList<Item>
                    val sum = intent.getSerializableExtra("sum")

                    ShowOrder(itemList, sum)

                }
            }
        }
    }
}

@Composable
fun ShowOrder(items: ArrayList<Item>, sum: Serializable?) {

    Column() {
        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Your order is: ")

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(items) { item ->
                ItemRow(item)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Your total sum is: " + sum)
    }
}
