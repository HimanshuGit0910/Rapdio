package com.example.rapdio.Activity

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.example.rapdio.R
import com.example.rapdio.helper.PreferenceHelper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            PreferenceHelper.getSharedPreferences(this)
            if (PreferenceHelper.getBooleanFromPreference("loginCheck")) {
                val intent = Intent(this,SliderActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondScreenActivity::class.java)
                startActivity(intent)
            }

        },1000)
    }
}