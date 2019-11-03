package com.example.hitthemole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.hitthemole.databinding.ActivityMainBinding

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        //@Suppress("UNUSED_VARIABLE")
        //val navController = this.findNavController(R.id.mainFragment)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //NavigationUI.setupActionBarWithNavController(this,navController)
        //NavigationUI.setupWithNavController(binding.navView, navController)

    }

}
