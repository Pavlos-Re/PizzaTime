package com.example.pizzatime

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzatime.ui.theme.PizzaTimeTheme

var money_sum : Double = 0.0

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
                        Text(text = "Menu",modifier = Modifier.padding(20.dp), fontWeight = FontWeight.Bold, fontSize = 40.sp, fontFamily = FontFamily.Cursive)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text("Main Dishes",fontWeight = FontWeight.Bold, fontSize = 30.sp, fontFamily = FontFamily.Cursive)
                        PizzaList()

                        Spacer(modifier = Modifier.height(20.dp))

                        Text("Drinks",fontWeight = FontWeight.Bold, fontSize = 30.sp, fontFamily = FontFamily.Cursive)
                        DrinksList()

                        Spacer(modifier = Modifier.height(90.dp))

                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Done")
                            }

                            Button(onClick = { /*TODO */ }) {
                                Text(text= "List")
                            }

                        }

                        Spacer(modifier = Modifier.height(40.dp))

                    }

                }
            }
        }
    }
}

@Composable
fun ColumnScope.DrinksList() {

    val context = LocalContext.current

    Column(
        Modifier
            .border(5.dp, Color.Black, RectangleShape)
            .verticalScroll(rememberScrollState())
            .weight(1f, false)
    ) {
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Cola Drink 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Orange Juice 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Lemonade Drink 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Sparkling Water 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Water 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Ice Tea 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Beer 2$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show() }
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
fun ColumnScope.PizzaList() {

    val context = LocalContext.current

    Column(
        Modifier
            .border(5.dp, Color.Black, RectangleShape)
            .verticalScroll(rememberScrollState())
            .weight(1f, false)) {
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Margarita Pizza 5$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Pepperoni Pizza 6$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 6; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Gustoza Pizza 6$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 6; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Hawaiian Pizza 6.5$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 6.5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "BBQ Chicken Pizza 7$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 7; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Cheese Pizza 7$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 7; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Vegetable Pizza 5$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Vegan Pizza 5.5$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 5.5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Buffalo Pizza 8$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 8; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "Supreme Pizza 9$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 9; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
            Text(
                text = "The Works Pizza 8$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 8; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show() }
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


