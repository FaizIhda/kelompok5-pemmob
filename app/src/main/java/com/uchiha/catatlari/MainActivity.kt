package com.uchiha.catatlari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uchiha.catatlari.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_catatlari)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, WelcomeFragment())
            .commit()
    }
}