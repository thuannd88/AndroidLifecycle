package com.example.androidLifecycle

import MyLifecycleObserverDev1
import MyLifecycleObserverDev2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.frameLayout,FirstFragment()).commit()
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