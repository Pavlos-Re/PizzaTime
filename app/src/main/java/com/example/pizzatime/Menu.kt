package com.example.pizzatime

import android.content.Intent
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

var OrderMenu = ArrayList<Item>()

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

                    val context = LocalContext.current

                    val OrderList = MenuList.getItems()

                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Menu",modifier = Modifier.padding(20.dp), fontWeight = FontWeight.Bold, fontSize = 40.sp, fontFamily = FontFamily.Cursive)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text("Main Dishes",fontWeight = FontWeight.Bold, fontSize = 30.sp, fontFamily = FontFamily.Cursive)
                        PizzaList(OrderList)

                        Spacer(modifier = Modifier.height(20.dp))

                        Text("Drinks",fontWeight = FontWeight.Bold, fontSize = 30.sp, fontFamily = FontFamily.Cursive)
                        DrinksList(OrderList)

                        Spacer(modifier = Modifier.height(90.dp))

                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

                            Button(onClick = {
                                intent = Intent(context, Order::class.java)
                                intent.putExtra("list", OrderMenu)
                                intent.putExtra("sum", money_sum)
                                context.startActivity(intent)
                            }) {
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
fun ColumnScope.DrinksList(OrderList: ArrayList<Item>) {

    val context = LocalContext.current

    Column(
        Modifier
            .border(5.dp, Color.Black, RectangleShape)
            .verticalScroll(rememberScrollState())
            .weight(1f, false)
    ) {
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Cola Drink 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show();OrderMenu.add(OrderList[0]) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Orange Juice 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show();OrderMenu.add(OrderList[1]) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Lemonade Drink 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[2])}
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Sparkling Water 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[3]) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Water 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[4]) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Ice Tea 1$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[5]) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add item",
                    Modifier.size(20.dp)
                )
                Text(text = "Add")
            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Beer 2$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 1; Toast.makeText(context, "Drink Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[6]) }
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
fun ColumnScope.PizzaList(OrderList: ArrayList<Item>) {

    val context = LocalContext.current

    Column(
        Modifier
            .border(5.dp, Color.Black, RectangleShape)
            .verticalScroll(rememberScrollState())
            .weight(1f, false)) {
        Row() {
            Text(
                text = "Margarita Pizza 5$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[7]) }
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
                text = "Pepperoni Pizza 6$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 6; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[8]) }
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
                text = "Gustoza Pizza 6$",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = { money_sum += 6; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[9])}
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
                onClick = { money_sum += 6.5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[10]) }
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
                onClick = { money_sum += 7; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[11]) }
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
                onClick = { money_sum += 7; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[12]) }
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
                onClick = { money_sum += 5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[13]) }
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
                onClick = { money_sum += 5.5; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[14]) }
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
                onClick = { money_sum += 8; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[15]) }
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
                onClick = { money_sum += 9; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[16]) }
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
                onClick = { money_sum += 8; Toast.makeText(context, "Pizza Added!", Toast.LENGTH_SHORT).show(); OrderMenu.add(OrderList[17]) }
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


