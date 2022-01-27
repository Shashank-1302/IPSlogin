package eu.example.ipslogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Student : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        val drawerlayout = findViewById<DrawerLayout>(R.id.student_layout)
        val navView = findViewById<NavigationView>(R.id.nav_view)

        toggle= ActionBarDrawerToggle(this,drawerlayout,R.string.nav_open,R.string.nav_close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_settings -> Toast.makeText(applicationContext,"setting",Toast.LENGTH_SHORT).show()
                R.id.nav_logout -> Toast.makeText(applicationContext,"logout",Toast.LENGTH_SHORT).show()
                R.id.Dashboard -> Toast.makeText(applicationContext,"dashboard",Toast.LENGTH_SHORT).show()
                R.id.Assignment -> Toast.makeText(applicationContext,"assignment",Toast.LENGTH_SHORT).show()
                R.id.Attendance -> Toast.makeText(applicationContext,"attendance",Toast.LENGTH_SHORT).show()
                R.id.MST -> Toast.makeText(applicationContext,"mst",Toast.LENGTH_SHORT).show()
                R.id.feedback -> Toast.makeText(applicationContext,"feedback",Toast.LENGTH_SHORT).show()
                R.id.onlineexam -> Toast.makeText(applicationContext,"online exam",Toast.LENGTH_SHORT).show()
                R.id.applyonline -> Toast.makeText(applicationContext,"apply online",Toast.LENGTH_SHORT).show()
            }
            true

        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}