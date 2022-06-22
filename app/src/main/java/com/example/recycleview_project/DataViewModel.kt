package com.example.recycleview_project

data class Hobby(var title: String, var image: Int)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Curried Lentils and Rice",R.drawable.food),
        Hobby("Big Night Pizza", R.drawable.halloween_food),
        Hobby("Cranberry and Apple stuffed", R.drawable.hot_dog),
        Hobby("Curried Lentils and Rice", R.drawable.milk_product),
        Hobby("Big Night Pizza", R.drawable.panipuri),
        Hobby("Cranberry and Apple stuffed", R.drawable.paper_plate)
    )
}