package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.helper.DBHelper
import com.example.myapplication.models.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DBHelper(this)
        db.insert(Student(name = "Akbarova Zumrad", phone_number = "+999 90-90"))
    }
}