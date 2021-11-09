package com.example.listalka08112021.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.listalka08112021.MainActivity
import com.example.listalka08112021.MainActivity2
import com.example.listalka08112021.R
import kotlinx.android.synthetic.main.fragment_1.*


class Fragment1 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        TOAST.setOnClickListener {
startActivity(Intent(activity,MainActivity2::class.java))
        }
    }

}