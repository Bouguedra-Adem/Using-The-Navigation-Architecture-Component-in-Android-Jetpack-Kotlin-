package com.example.tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import com.example.tp.R.id.fragment as fragment1

class MainActivity : AppCompatActivity() {
    private lateinit var  viewmodel :ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nav = findNavController(R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this,nav)
        this.viewmodel = ViewModelProviders.of(this).get(ViewModel ::class.java)



    }

override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.fragment)
    return navController.navigateUp()

}
}