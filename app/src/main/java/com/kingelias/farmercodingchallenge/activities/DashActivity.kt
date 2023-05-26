package com.kingelias.farmercodingchallenge.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.kingelias.farmercodingchallenge.R
import com.kingelias.farmercodingchallenge.databinding.ActivityDashBinding
import com.kingelias.farmercodingchallenge.fragments.FormFragment

class DashActivity : AppCompatActivity() {
    private lateinit var dashBinding: ActivityDashBinding

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashBinding = ActivityDashBinding.inflate(layoutInflater)
        setContentView(dashBinding.root)

        dashBinding.bottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.formFragment -> fragmentReplacement(FormFragment())
                R.id.profileFragment -> fragmentReplacement(FormFragment())
                else -> {

                }
            }
            true
        }
    }

    private fun fragmentReplacement(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_nav_host, fragment)
        fragmentTransaction.commit()
    }
}