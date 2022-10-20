package com.codepath.nytimes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.codepath.nytimes.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        //val fragment1: Fragment = SettingsFragment()
        //val fragment2: Fragment = HomeFragment()
        //val fragment3: Fragment = ThirdFragment()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // handle navigation selection
        //bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
//            when (item.itemId) {
//                //R.id.action_favorites -> fragment = fragment1
//                R.id.action_schedules -> fragment = fragment2
//                //R.id.action_music -> fragment = fragment3
//            }
            fragmentManager.beginTransaction().replace(R.id.rlContainer, fragment).commit()
            true
        }

        // Set default selection
       // bottomNavigationView.selectedItemId = R.id.action_favorites
    }
