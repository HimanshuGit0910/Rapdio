package com.example.rapdio.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rapdio.R
import kotlinx.android.synthetic.main.activity_rider_arrived.*

class RiderArrived : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rider_arrived)
        btnLetsRide.setOnClickListener {
            finish()
        }

    }
}