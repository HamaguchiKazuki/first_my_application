package com.example.first_my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private val TAG: String = MainActivity::class.java.simpleName

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
        setContentView(R.layout.activity_main)
    }
}