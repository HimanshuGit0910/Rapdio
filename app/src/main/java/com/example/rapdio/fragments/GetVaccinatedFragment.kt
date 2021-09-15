package com.example.rapdio.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rapdio.R
import kotlinx.android.synthetic.main.fragment_get_vaccinated.*

class GetVaccinatedFragment : Fragment() {
    // TODO: Rename and change types of parameters
  //  private var param1: String? = null
    //private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get_vaccinated, container, false)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onResume() {
        super.onResume()
        covidWeb.settings.javaScriptEnabled=true
        covidWeb.settings.useWideViewPort=true
        covidWeb.settings.loadWithOverviewMode=true
        covidWeb.loadUrl("https://www.cowin.gov.in/home/")
    }
}