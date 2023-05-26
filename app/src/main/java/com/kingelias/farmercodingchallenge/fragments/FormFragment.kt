package com.kingelias.farmercodingchallenge.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kingelias.farmercodingchallenge.R
import com.kingelias.farmercodingchallenge.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    private lateinit var formBinding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        formBinding = FragmentFormBinding.inflate(inflater, container, false)


        return formBinding.root
    }

}