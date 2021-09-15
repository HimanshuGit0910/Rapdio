package com.example.rapdio.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.rapdio.R
import kotlinx.android.synthetic.main.activity_slider.*

class SliderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)



        val imageList = ArrayList<SlideModel>() // Create image list


        imageList.add(SlideModel(R.drawable.convient, ""))
        imageList.add(SlideModel(R.drawable.safety, ""))
        imageList.add(SlideModel(R.drawable.hygienic, ""))
        imageList.add(SlideModel(R.drawable.otherservices, ""))




        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)



        suno.setOnClickListener{
            var intent=Intent(this,FirstScreenActivity::class.java)
            startActivity(intent)
        }
    }
}