package com.example.pizzatime

object MenuList {

    fun getItems(): ArrayList<Item> {
        val itemList = ArrayList<Item>()

        val item1 = Item("Cola Drink", 1.0)
        itemList.add(item1)

        val item2 = Item("Orange Juice", 1.0)
        itemList.add(item2)

        val item3 = Item("Lemonade Drink", 1.0)
        itemList.add(item3)

        val item4 = Item("Sparkling Water", 1.0)
        itemList.add(item4)

        val item5 = Item("Water", 1.0)
        itemList.add(item5)

        val item6 = Item("Ice Tea", 1.0)
        itemList.add(item6)

        val item7 = Item("Beer", 2.0)
        itemList.add(item7)


        val item8 = Item("Margarita Pizza", 5.0)
        itemList.add(item8)

        val item9 = Item("Pepperoni Pizza", 6.0)
        itemList.add(item9)

        val item10 = Item("Gustoza Pizza", 6.0)
        itemList.add(item10)

        val item11 = Item("Hawaiian Pizza", 6.5)
        itemList.add(item11)

        val item12 = Item("BBQ Chicken Pizza", 7.0)
        itemList.add(item12)

        val item13 = Item("Cheese Pizza", 7.0)
        itemList.add(item13)

        val item14 = Item("Vegetable Pizza", 5.0)
        itemList.add(item14)

        val item15 = Item("Vegan Pizza", 5.5)
        itemList.add(item15)

        val item16 = Item("Buffalo Pizza", 8.0)
        itemList.add(item16)

        val item17 = Item("Supreme Pizza", 9.0)
        itemList.add(item17)

        val item18 = Item("The Works Pizza", 8.0)
        itemList.add(item18)


        return itemList
    }
}