package com.example.fragapp.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.fragapp.R
import java.nio.file.Files.find

class Home : Fragment(R.layout.fragment_home) {


    private lateinit var usernameEditText: EditText
    private lateinit var surnameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var jobEditText: EditText
    private lateinit var sendButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usernameEditText = view.findViewById(R.id.usernameET)
        surnameEditText = view.findViewById(R.id.lastnameET)
        ageEditText = view.findViewById(R.id.ageET)
        jobEditText = view.findViewById(R.id.jobET2)
        sendButton = view.findViewById(R.id.answersButton)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val username = usernameEditText.text.toString()
            val age = ageEditText.text.toString()
            val job = jobEditText.text.toString()
            val surname = surnameEditText.text.toString()

            if (username.isEmpty()) {
                return@setOnClickListener
            }
            if (age.isEmpty()) {
                return@setOnClickListener
            }
            if (job.isEmpty()) {
                return@setOnClickListener
            }
            if (surname.isEmpty()) {
                return@setOnClickListener
            }


            val action = HomeDirections.actionHomeFragmentToProfileFragment(username, surname, age, job)

            navController.navigate(action)

            }



        }
    }
