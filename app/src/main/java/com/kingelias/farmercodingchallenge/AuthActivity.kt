package com.kingelias.farmercodingchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kingelias.farmercodingchallenge.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var authBinding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_auth)

        authBinding.loginBn.setOnClickListener{
            startActivity(Intent(this, DashActivity::class.java))
        }
        authBinding.welcome.setOnClickListener{
            val intent = Intent(this, DashActivity::class.java)
            startActivity(intent)
        }
    }

}