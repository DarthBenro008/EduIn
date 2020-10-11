package com.benrostudios.educatio.data.models

data class Post(
    val id: Int,
    val image: String,
    val username: String,
    val course: String,
    val date: String,
    val review: String,
    val likes: Int,
    val liked: Boolean
)