package com.example.listalka08112021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.listalka08112021.fragments.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private val home = MainFragment()
    private val musei = Fragment2()
    private val message = Fragment3()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (check ==1){addFragment(frag)}
        if (check ==2){addFragment(musei)}
        if (check ==3){addFragment(message)}
        bottomNavBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> addFragment(frag)
                R.id.musei -> addFragment(musei)
                R.id.message -> addFragment(message)
            }
            true
        }


    }
    fun addFragment(fragment: Fragment){
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.FRAME,fragment)
            transaction.commit()
        }
    }
}