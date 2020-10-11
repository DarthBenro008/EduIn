package com.benrostudios.educatio.data.premade

import com.benrostudios.educatio.R
import com.benrostudios.educatio.data.models.Classroom
import com.benrostudios.educatio.data.models.Course
import com.benrostudios.educatio.data.models.Post
import com.benrostudios.educatio.data.models.Section
import kotlin.random.Random

val posts: List<Post> = listOf(
    Post(
        0,
        R.drawable.adarsh,
        "Adarsh Singh",
        "Java Course",
        "12th October 2020",
        "Started the course recently, am loving it! java functions and OOPS are amazing! Highly recommend it",
        65,
        false
    ),
    Post(
        0,
        R.drawable.rohan,
        "Rohan Arora",
        "Music Course",
        "11th October 2020",
        "Music course is great, its could have been better if the author has included tabla notes and more details, just started out with piano, so far so good! ",
        43,
        false
    ),
    Post(
        0,
        R.drawable.manas,
        "Manas",
        "Physics Course",
        "12th October 2020",
        "Everything is relative!",
        25,
        false
    )
)

val courses: List<Course> = listOf(
    Course(
        0,
        "https://www.tutorialspoint.com/java/images/java_programming.jpg",
        "Java Course",
        "Learn various industry level of java concepts in 48hrs! from variables to higher level abstraction, everything is covered in this course! ",
        4.5,
        89,
        "Aksash Mehta"
    ),
    Course(
        0,
        "https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjAxMTcyLmFwcDY1NDI3MV9zY3JlZW5fMF8xNTI5MjQwNTk3XzA5OA/screen-0.jpg?fakeurl=1&type=.jpg",
        "Physics Course",
        "Learn elementary level physics. This is a crash course that will help provide you to gain insights about basic kinematics and later build up to relativity",
        3.2,
        23,
        "Devang Singh"
    ),
    Course(
        0,
        "https://i.ytimg.com/vi/u8wZG5B2bK4/maxresdefault.jpg",
        "Music Course",
        "Starting out to learn Piano? Guitar? learn the basics of trinity notes from this course!",
        2.4,
        398,
        "Anushi Arora"
    ),
    Course(
        0,
        "https://www.tutorialspoint.com/java/images/java_programming.jpg",
        "Java Course",
        "Learn various industry level of java concepts in 48hrs! from variables to higher level abstraction, everything is covered in this course! ",
        4.5,
        89,
        "Aksash Mehta"
    ),
    Course(
        0,
        "https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjAxMTcyLmFwcDY1NDI3MV9zY3JlZW5fMF8xNTI5MjQwNTk3XzA5OA/screen-0.jpg?fakeurl=1&type=.jpg",
        "Physics Course",
        "Learn elementary level physics. This is a crash course that will help provide you to gain insights about basic kinematics and later build up to relativity",
        3.2,
        23,
        "Devang Singh"
    ),
    Course(
        0,
        "https://i.ytimg.com/vi/u8wZG5B2bK4/maxresdefault.jpg",
        "Music Course",
        "Starting out to learn Piano? Guitar? learn the basics of trinity notes from this course!",
        2.4,
        398,
        "Anushi Arora"
    ),
    Course(
        0,
        "https://www.tutorialspoint.com/java/images/java_programming.jpg",
        "Java Course",
        "Learn various industry level of java concepts in 48hrs! from variables to higher level abstraction, everything is covered in this course! ",
        4.5,
        89,
        "Aksash Mehta"
    ),
    Course(
        0,
        "https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjAxMTcyLmFwcDY1NDI3MV9zY3JlZW5fMF8xNTI5MjQwNTk3XzA5OA/screen-0.jpg?fakeurl=1&type=.jpg",
        "Physics Course",
        "Learn elementary level physics. This is a crash course that will help provide you to gain insights about basic kinematics and later build up to relativity",
        3.2,
        23,
        "Devang Singh"
    ),
    Course(
        0,
        "https://i.ytimg.com/vi/u8wZG5B2bK4/maxresdefault.jpg",
        "Music Course",
        "Starting out to learn Piano? Guitar? learn the basics of trinity notes from this course!",
        2.4,
        398,
        "Anushi Arora"
    ),
    Course(
        0,
        "https://www.tutorialspoint.com/java/images/java_programming.jpg",
        "Java Course",
        "Learn various industry level of java concepts in 48hrs! from variables to higher level abstraction, everything is covered in this course! ",
        4.5,
        89,
        "Aksash Mehta"
    ),
    Course(
        0,
        "https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjAxMTcyLmFwcDY1NDI3MV9zY3JlZW5fMF8xNTI5MjQwNTk3XzA5OA/screen-0.jpg?fakeurl=1&type=.jpg",
        "Physics Course",
        "Learn elementary level physics. This is a crash course that will help provide you to gain insights about basic kinematics and later build up to relativity",
        3.2,
        23,
        "Devang Singh"
    ),
    Course(
        0,
        "https://i.ytimg.com/vi/u8wZG5B2bK4/maxresdefault.jpg",
        "Music Course",
        "Starting out to learn Piano? Guitar? learn the basics of trinity notes from this course!",
        2.4,
        398,
        "Anushi Arora"
    )
)

val recCourses: List<Course> = listOf(
    Course(
        0,
        "https://www.tutorialspoint.com/java/images/java_programming.jpg",
        "Java Course",
        "Learn various industry level of java concepts in 48hrs! from variables to higher level abstraction, everything is covered in this course! ",
        4.5,
        89,
        "Aksash Mehta"
    ),
    Course(
        0,
        "https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjAxMTcyLmFwcDY1NDI3MV9zY3JlZW5fMF8xNTI5MjQwNTk3XzA5OA/screen-0.jpg?fakeurl=1&type=.jpg",
        "Physics Course",
        "Learn elementary level physics. This is a crash course that will help provide you to gain insights about basic kinematics and later build up to relativity",
        3.2,
        23,
        "Devang Singh"
    ),
    Course(
        0,
        "https://i.ytimg.com/vi/u8wZG5B2bK4/maxresdefault.jpg",
        "Music Course",
        "Starting out to learn Piano? Guitar? learn the basics of trinity notes from this course!",
        2.4,
        398,
        "Anushi Arora"
    )

)

val sections: List<Section> = listOf(
    Section(1, "Variables", "4", 4),
    Section(2, "Functions", "6", 4),
    Section(3, "Inheritence", "8", 4),
    Section(4, "OOPS", "9", 4)
)

fun generateCourses(courses: List<Course>): MutableList<Classroom> {
    val classrooms: MutableList<Classroom> = mutableListOf()
    for (course in courses) {
        val rand = Random.nextDouble() * 100
        classrooms.add(
            Classroom(course, rand, sections)
        )
    }
    return classrooms
}

val colors: List<String> = listOf(
    "#FFB7B2", "#FFDAC1", "#E2F0CB", "#B5EAD7", "#C7CEEA", "#FFFFBA"
)

