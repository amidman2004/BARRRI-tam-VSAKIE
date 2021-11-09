package com.example.listalka08112021

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.listalka08112021.adapter.ViewPagerAdapter
import com.example.listalka08112021.adapter.mfragment
import com.example.listalka08112021.fragments.Fragment1
import com.example.listalka08112021.fragments.Fragment2
import com.example.listalka08112021.fragments.Fragment3
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            OK()
        button.setOnClickListener {
            val adapter =  ViewPagerAdapter(supportFragmentManager)
            var int = viewPager.currentItem
            var count = viewPager.adapter?.count
            if (count != null) {
                when{
                    int == count-1 -> int = -1
                }
            }
            viewPager.setCurrentItem(int + 1, true)
        }

    }
    fun OK(){
        val adapter =  ViewPagerAdapter(supportFragmentManager)
        val array = arrayListOf(mfragment(Fragment1(),"Home"),
        mfragment(Fragment2(),"Musei"),
        mfragment(Fragment3(),"Message")
        )
        adapter.AddFragments(array)

        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.home)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.musei)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.message)

    }
}