package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
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

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout

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

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setTitle("Home")

        drawer = findViewById(R.id.drawer)

        //Adicionar botão que abre o drawerMenu
        var toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()


        setFragment(fragmentHome)

    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.menuHome ->{
                setFragment(fragmentHome)
            }
            R.id.menuConsole ->{
                setFragment(fragmentConsole)
            }
            R.id.menuGames ->{
                setFragment(fragmentGame)
            }

        }

        //Selecionar o item de menu da BottomNavigationView
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        //Fechar Drawer se estiver aberto
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }
}