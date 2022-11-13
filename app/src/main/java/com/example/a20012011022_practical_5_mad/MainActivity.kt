package com.example.a20012011022_practical_5_mad


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //By using explicit intent we used this start and stop service by calling MyService Class

    fun play(view:View){
        Intent(applicationContext,MyService::class.java)
            .putExtra(MyService.DATA_KEY,MyService.DATA_VALUE)
            .apply { startService(this) }
    }
    fun stop(view: View){
        Intent(applicationContext,MyService::class.java)
            .apply { stopService(this) }
    }
}