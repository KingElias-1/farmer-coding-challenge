package com.kingelias.farmercodingchallenge.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kingelias.farmercodingchallenge.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var authBinding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(authBinding.root)

        Log.i("Button", "Auth")
        authBinding.loginBn.setOnClickListener{
            startActivity(Intent(this, DashActivity::class.java))
            Log.i("Button", "Pressed")
        }
    }

}