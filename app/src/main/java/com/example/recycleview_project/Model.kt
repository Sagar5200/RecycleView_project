package com.example.recycleview_project

data class Hobby(var title: String,)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Curried Lentils and Rice",),
        Hobby("Big Night Pizza"),
        Hobby("Cranberry and Apple stuffed"),
        Hobby("Curried Lentils and Rice"),
        Hobby("Big Night Pizza"),
        Hobby("Cranberry and Apple stuffed")
    )
}