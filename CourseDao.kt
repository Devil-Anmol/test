package com.example.myapplication2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CourseDao {
    @Insert
    fun insert(course: Course)

    @Query("SELECT * FROM courses")
    fun getAllCourses(): List<Course>
}


class CourseRepository(private val courseDao: CourseDao) {
    fun insertCourse(course: Course) {
        courseDao.insert(course)
    }

    fun getAllCourses(): List<Course> {
        return courseDao.getAllCourses()
    }
}