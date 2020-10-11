package com.benrostudios.educatio.data.models

data class Course(
    val id: Int,
    val image: String,
    val title: String,
    val desc: String,
    val rating: Double,
    val price: Int,
    val author: String
)