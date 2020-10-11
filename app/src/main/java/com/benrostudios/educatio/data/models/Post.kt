package com.benrostudios.educatio.data.models

data class Post(
    val id: Int,
    val image: Int,
    val username: String,
    val course: String,
    val date: String,
    val review: String,
    var likes: Int,
    var liked: Boolean
)