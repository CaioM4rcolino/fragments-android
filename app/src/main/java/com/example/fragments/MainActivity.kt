package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.fragments.fragmentos.ConsoleFragment
import com.example.fragments.fragmentos.GameFragment
import com.example.fragments.fragmentos.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),
                     BottomNavigationView.OnNavigationItemSelectedListener,
                     NavigationView.OnNavigationItemSelectedListener {

    private lateinit var fragmentHome: HomeFragment
    private lateinit var fragmentConsole: ConsoleFragment
    private lateinit var fragmentGame: GameFragment

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var drawerNavigation: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

        fragmentHome = HomeFragment()
        fragmentConsole = ConsoleFragment()
        fragmentGame = GameFragment()

        bottomNavigation = findViewById(R.id.bottomNavigation)

        drawerNavigation = findViewById(R.id.drawer_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener(this)
        drawerNavigation.setNavigationItemSelectedListener(this)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragmentHome)
            .commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.menuHome ->{
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, fragmentHome)
                    .commit()
            }
            R.id.menuConsole ->{
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, fragmentConsole)
                    .commit()
            }
            R.id.menuGames ->{
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, fragmentGame)
                    .commit()
            }

        }
        return true
    }
}