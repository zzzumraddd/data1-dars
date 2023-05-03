package com.example.myapplication.helper

import com.example.myapplication.models.Student

interface CURD {
    fun insert(student: Student)

    fun delete(student: Student)

    fun loadList(student: Student): MutableList<Student>

}