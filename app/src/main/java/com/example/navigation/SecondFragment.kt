package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

//        view.setOnClickListener{
//            it.findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
//        }


        // With Safe Args
        view.setOnClickListener{view ->
            view.findNavController()
                .navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment())
        }

        return view
    }

}