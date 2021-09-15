package com.example.rapdio.navDrawerFragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.rapdio.R
import com.example.rapdio.helper.PreferenceHelper
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment(R.layout.fragment_settings) {


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        activity?.actionBar?.hide()
        super.onViewCreated(view, savedInstanceState)

        PreferenceHelper.getSharedPreferences(requireContext())



        clAppLanguage.setOnClickListener {

            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
            ft.add(
                R.id.fragmentContainerView,
                LanguageFragment(),
                "LanguageFragment"
            ).addToBackStack("LanguageFragment")
            ft.commit()
        }



        when (PreferenceHelper.getStringFromPreference("languagePreferenceString")) {

            "hi" -> {
                tvLanguageChange.text = "Hindi"
            }
            "en" -> {
                tvLanguageChange.text = "English"
            }
            "kn" -> {
                tvLanguageChange.text = "Kannada"
            }
            "ta" -> {
                tvLanguageChange.text = "Tamil"
            }
            "te" -> {
                tvLanguageChange.text = "Telugu"
            }

        }


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_support_button, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.supportButton -> {
                Toast.makeText(requireContext(), "clicked", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}