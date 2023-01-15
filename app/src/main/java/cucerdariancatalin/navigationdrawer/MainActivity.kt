package cucerdariancatalin.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.FragmentTransaction
import cucerdariancatalin.navigationdrawer.Fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var homeFragment: Home_Fragment
    lateinit var profileFragment: Profile_Fragment
    lateinit var notificationFragment: Notification_Fragment
    lateinit var locationFragment: Location_Fragment
    lateinit var settingsFragment: Settings_Fragment
    lateinit var aboutFragment: About_Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        homeFragment = Home_Fragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        navigation_view.setNavigationItemSelectedListener { menuItem ->

            menuItem.isChecked = false
            drawerLayout.closeDrawers()

            when (menuItem.itemId) {

                R.id.nav_home -> {
                    homeFragment = Home_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }


                R.id.nav_profile -> {
                    profileFragment = Profile_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.nav_notification -> {
                    notificationFragment = Notification_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, notificationFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.nav_location -> {
                    locationFragment = Location_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, locationFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.nav_settings -> {
                    settingsFragment = Settings_Fragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, settingsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

//                R.id.nav_about -> {
//                    aboutFragment = About_Fragment()
//                    supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.frame_layout, aboutFragment)
//                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                        .commit()
//                }

            }
            true
        }
    }
}
