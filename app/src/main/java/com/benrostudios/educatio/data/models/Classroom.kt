package com.benrostudios.educatio.data.models

data class Classroom(
    val course: Course,
    val progress: Double,
    val sections: List<Section>
)