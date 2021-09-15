package com.example.rapdio.navDrawerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.rapdio.R
import com.example.rapdio.fragments.GetVaccinatedFragment
import kotlinx.android.synthetic.main.fragment_covid19.*

class Covid19Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_covid19, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnbook_vaccine.setOnClickListener {
            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
            ft.add(
                R.id.fragmentContainerView,
                GetVaccinatedFragment(),
                "CovidFragment"
            ).addToBackStack(null)
            ft.commit()
        }
    }
}