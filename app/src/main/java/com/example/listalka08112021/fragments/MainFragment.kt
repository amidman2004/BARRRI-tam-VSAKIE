package com.example.listalka08112021.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listalka08112021.KOSTIL
import com.example.listalka08112021.MainActivity2
import com.example.listalka08112021.R
import com.example.listalka08112021.adapter.ViewPagerAdapter
import com.example.listalka08112021.adapter.mfragment
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_main.*


var frag:Fragment = MainFragment()
var check = 1
class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      OKKA()
        INTKA.setOnClickListener {
            frag = BlankFragment()
            startActivity(Intent(activity, MainActivity2::class.java))
            check = 1
        }
    }

    fun OKKA(){
        val adapter = ViewPagerAdapter(childFragmentManager)
        val array = arrayListOf(
            mfragment(Fragment1(),"Home"),
            mfragment(Fragment2(),"Musei"),
            mfragment(Fragment3(),"Message")
        )
        adapter.AddFragments(array)

        VIEWKA.adapter = adapter

        TABKA.setupWithViewPager(VIEWKA)

        TABKA.getTabAt(0)!!.setIcon(R.drawable.home)
        TABKA.getTabAt(1)!!.setIcon(R.drawable.musei)
        TABKA.getTabAt(2)!!.setIcon(R.drawable.message)
    }
}