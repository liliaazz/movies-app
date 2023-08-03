package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.login_btn
import kotlinx.android.synthetic.main.login.user__name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


    login_btn.setOnClickListener {
        var user = user__name.text.toString()

        val i = Intent(this@MainActivity, MainActivity2::class.java)
        i.putExtra("username", "$user")
        startActivity(i)
    }
    }
}

