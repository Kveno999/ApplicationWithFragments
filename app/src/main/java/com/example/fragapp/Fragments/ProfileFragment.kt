package com.example.fragapp.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragapp.R

class ProfileFragment :Fragment(R.layout.fragment_profile){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            ProfileFragmentArgs.fromBundle(requireArguments()).profile
        view.findViewById<TextView>(R.id.textView2).text =
            ProfileFragmentArgs.fromBundle(requireArguments()).surname
        view.findViewById<TextView>(R.id.textView3).text =
            ProfileFragmentArgs.fromBundle(requireArguments()).age
        view.findViewById<TextView>(R.id.textView4).text =
            ProfileFragmentArgs.fromBundle(requireArguments()).job





        val button = view.findViewById<Button>(R.id.changeSex)
        val button2 = view.findViewById<Button>(R.id.changeSex2)
        val image = view.findViewById<ImageView>(R.id.imageView1)
        button2.setOnClickListener {
            image.setBackgroundResource(R.drawable.womanavat)
        }
        button.setOnClickListener {
            image.setBackgroundResource(R.drawable.avatar)
        }


    }

}