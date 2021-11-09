package com.example.listalka08112021.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
data class mfragment(val fragment: Fragment,val title: String)
class ViewPagerAdapter(supportFragmentManager:FragmentManager):FragmentPagerAdapter(supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

   val mFragmentList = ArrayList<Fragment>()
   val mFragmentTitleList = ArrayList<String>()


    override fun getCount(): Int {
        return mFragmentList.size
    }
    override fun getItem(position: Int): Fragment {
        return  mFragmentList[position]
    }



    override fun getPageTitle(position: Int): CharSequence? {
        return  mFragmentTitleList[position]
    }

    fun AddFragments (list: ArrayList<mfragment>) {
        for (i in 0 until list.size) {
            mFragmentList.add(list[i].fragment)
            mFragmentTitleList.add(list[i].title)
        }
    }



}