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
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DAPOFIG.setOnClickListener {
            frag = MainFragment()
            startActivity(Intent(activity,MainActivity2::class.java))
        }
    }
}