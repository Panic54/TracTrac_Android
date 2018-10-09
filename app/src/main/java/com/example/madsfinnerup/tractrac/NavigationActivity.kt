package com.example.madsfinnerup.tractrac

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                ShowHomeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {

                ShowSettingsFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        val fragmentHome = HomeFragment()
        val transactionHome = manager.beginTransaction()

        transactionHome.replace(R.id.fragment, fragmentHome)
        transactionHome.addToBackStack(null)
        transactionHome.commit()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun ShowHomeFragment(){
        val fragmentHome = HomeFragment()
        val transactionHome = manager.beginTransaction()

        transactionHome.replace(R.id.fragment, fragmentHome)
        transactionHome.addToBackStack(null)
        transactionHome.commit()
    }

    fun ShowSettingsFragment(){
        val fragmentSettings = SettingsFragment()
        val transactionHome = manager.beginTransaction()

        transactionHome.replace(R.id.fragment, fragmentSettings)
        transactionHome.addToBackStack(null)
        transactionHome.commit()
    }
}
