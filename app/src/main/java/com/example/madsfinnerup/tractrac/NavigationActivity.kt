package com.example.madsfinnerup.tractrac

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v7.app.AppCompatActivity
import com.example.madsfinnerup.tractrac.R.*
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            id.navigation_home -> {

                navigateHome()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_events -> {

                navigateEvents()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_clubs -> {

                navigateClubs()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_settings -> {

                navigateSettings()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_navigation)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        navigateHome()
    }

    fun navigateHome() {
        val transaction = manager.beginTransaction()
        val fragment = HomeFragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateEvents() {
        val transaction = manager.beginTransaction()
        val fragment = EventFragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateClubs() {
        val transaction = manager.beginTransaction()
        val fragment = Clubs_Fragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }



    fun navigateSettings() {
        val transaction = manager.beginTransaction()
        val fragment = Settings_Fragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
