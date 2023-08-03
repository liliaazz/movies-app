package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.allmovies
import kotlinx.android.synthetic.main.activity_main.featuredmovies
import kotlinx.android.synthetic.main.activity_main.greeting

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = intent.getStringExtra("username")

        if (data != null) {
            // Set the greeting text to display the retrieved data
            greeting.text = "Hello $data"
        } else {
            // Handle the case when data is null (optional, depending on your use case)
            greeting.text = "Hello, User"
        }


         featuredmovies.setOnClickListener {
           val i = Intent(this@MainActivity2,MainActivity3::class.java)

           startActivity(i)
      }


      allmovies.setOnClickListener {
           val k = Intent(this@MainActivity2, MainActivity3::class.java )
           startActivity(k)
       }
    }
}