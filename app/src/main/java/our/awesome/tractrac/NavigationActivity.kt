package our.awesome.tractrac

import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.example.madsfinnerup.tractrac.R
import com.example.madsfinnerup.tractrac.R.id
import com.example.madsfinnerup.tractrac.R.layout
import our.awesome.tractrac.home.HomeFragment
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

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
            id.navigation_search -> {

                navigateSearch()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_navigation)
        setSupportActionBar(findViewById(R.id.tractrac_toolbar))

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        navigateHome()
    }

    fun navigateHome() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        val transaction = manager.beginTransaction()
        val fragment = HomeFragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateEvents() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        val transaction = manager.beginTransaction()
        val fragment = EventFragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateClubs() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        val transaction = manager.beginTransaction()
        val fragment = Clubs_Fragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateSettings() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        val transaction = manager.beginTransaction()
        val fragment = Settings_Fragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun navigateSearch() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        val transaction = manager.beginTransaction()
        val fragment = SearchFragment()

        transaction.replace(id.fragmentFrame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

      //  setContentView(R.layout.activity_search)
    }
}