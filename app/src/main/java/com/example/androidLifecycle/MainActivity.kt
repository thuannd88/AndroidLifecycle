package com.example.androidLifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainAct222","OnCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainAct222","OnStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainAct222","OnResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainAct222","OnPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainAct222","OnStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainAct222","OnDestroy called")
    }
}