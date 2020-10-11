package com.benrostudios.educatio.data.premade

import com.benrostudios.educatio.data.models.Classroom
import com.benrostudios.educatio.data.models.Course
import com.benrostudios.educatio.data.models.Post
import com.benrostudios.educatio.data.models.Section
import kotlin.random.Random

val posts: List<Post> = listOf(
    Post(0, "", "Ayan Misha", "Java Course", "12th October 2020", "Dope stuff ngl", 65, false),
    Post(0, "", "Ayan Misha", "Java Course", "12th October 2020", "Dope stuff ngl", 65, false),
    Post(0, "", "Ayan Misha", "Java Course", "12th October 2020", "Dope stuff ngl", 65, false)
)

val courses: List<Course> = listOf(
    Course(0, "", "Java Course", "An epic java course", 4.5, 240, "Akshay Kumar"),
    Course(0, "", "Java Course", "An epic java course", 4.5, 240, "Akshay Kumar"),
    Course(0, "", "Java Course", "An epic java course", 4.5, 240, "Akshay Kumar")
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

