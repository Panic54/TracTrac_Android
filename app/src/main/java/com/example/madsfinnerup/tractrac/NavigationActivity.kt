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

                navigateHome()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_events -> {

                navigateEvents()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_clubs -> {

                navigateClubs()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {

                navigateSettings()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        navigateHome()
    }

    fun navigateHome() {
        val transaction = manager.beginTransaction()
        val fragment = HomeFragment()

        transaction.replace(R.id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateEvents() {
        val transaction = manager.beginTransaction()
        val fragment = EventsFragment()

        transaction.replace(R.id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateClubs() {
        val transaction = manager.beginTransaction()
        val fragment = ClubsFragment()

        transaction.replace(R.id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }



    fun navigateSettings() {
        val transaction = manager.beginTransaction()
        val fragment = SettingsFragment()

        transaction.replace(R.id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
