package com.example.tugas2actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.tugas2actionbar.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_menu1-> Toast.makeText(this, "Menu 1 Clicked", Toast.LENGTH_SHORT).show()
            R.id.action_menu2 -> Toast.makeText(this, "Menu 2 Clicked", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}