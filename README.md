package com.example.myapplication2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel

class CourseViewModel : ViewModel() {
    val courseRepository = CourseRepository(CourseDao)
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    // Preview content
}

@Preview(showBackground = true)
@Composable
fun CourseInputScreenPreview() {
    // Preview content
}
