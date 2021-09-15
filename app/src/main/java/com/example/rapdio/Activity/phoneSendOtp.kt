package com.example.rapdio.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.rapdio.R
import com.example.rapdio.helper.PreferenceHelper
import com.example.rapdio.helper.USER_PHONE_LOGIN
import kotlinx.android.synthetic.main.activity_otpvalidation.*

class phoneSendOtp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpvalidation)

        terms.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rapido.bike/CustomerTerms"))
            startActivity(browserIntent)
        }
        pricy.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rapido.bike/Privacy"))
            startActivity(browserIntent)
        }

        button.setOnClickListener {

            if (phoneSend.text.count() == 10) {
                PreferenceHelper.writeBooleanToPreference(USER_PHONE_LOGIN, true)
                val i = Intent(this, OTPSecondActivity::class.java).apply {
                    putExtra("mobileNumber", phoneSend.text.toString())
                }
                startActivity(i)
            } else {
                Toast.makeText(this, "Enter 10 digits mobile number", Toast.LENGTH_LONG).show()
            }
        }
    }
}