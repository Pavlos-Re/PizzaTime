package com.example.pizzatime
import android.os.Bundle
import android.print.PrintAttributes.Margins
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzatime.ui.theme.PizzaTimeTheme

class Menu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Menu",modifier = Modifier.padding(30.dp), fontWeight = FontWeight.Bold, fontSize = 40.sp, fontFamily = FontFamily.Cursive)

                        PizzaList()

                        DrinksList()

                    }

                }
            }
        }
    }
}

@Composable
fun DrinksList() {
    Column(Modifier.border(5.dp, Color.Black, RectangleShape)) {
        Row() {
            Text(
                text = "Cola Drink",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "Orange Juice",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "Lemonade Drink",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
    }
}

@Composable
fun PizzaList() {
    Column(Modifier.border(5.dp, Color.Black, RectangleShape)) {
        Row() {
            Text(
                text = "Margarita Pizza",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "Pepperoni Pizza",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "Gustoza Pizza",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "Hawaiian Pizza",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row() {
            Text(
                text = "BBQ Chicken Pizza",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
    }
}


