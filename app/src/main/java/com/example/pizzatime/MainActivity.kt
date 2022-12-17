package com.example.pizzatime

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzatime.ui.theme.PizzaTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {

                    Column(modifier = Modifier.fillMaxSize(0.5f), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

                        Greeting()

                        Column(modifier = Modifier.fillMaxSize(0.7f), horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center)
                            {

                            Options()

                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    ClickableText(text = AnnotatedString("Pizza Time"), onClick = {}, modifier = Modifier.padding(50.dp), style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold))

    Row() {
        Image(
            painter = painterResource(id = R.drawable.store),
            contentDescription = "Store Icon",
            modifier = Modifier.size(100.dp)
        )

    }
}

@Composable
fun Options() {

    val context = LocalContext.current

    Row() {
        ClickableText(
            text = AnnotatedString("Menu"),
            onClick = {
                context.startActivity(Intent(context, Menu::class.java))
            },
            modifier = Modifier.padding(10.dp),
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
        )
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu Icon",
            modifier = Modifier.size(50.dp)
        )
    }
    Row() {
        ClickableText(
            text = AnnotatedString("User Account"),
            onClick = {},
            modifier = Modifier.padding(20.dp),
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
        )
        Image(
            painter = painterResource(id = R.drawable.customer),
            contentDescription = "Customer Icon",
            modifier = Modifier.size(50.dp)
        )
    }
}
