package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var currentImage = 1
    lateinit var image : ImageView
    var places = arrayOf("Zero Point","BadShahi Mosque","Faisal Mosque","Badshahi Mosque")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val pre  = findViewById<ImageButton>(R.id.btnPre)
        val placeName = findViewById<TextView>(R.id.tvHello2)
        next.setOnClickListener {
          var idCurrentImageStr = "th$currentImage"
          var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageStr,"id",packageName)
          image = findViewById(idCurrentImageInt)
          image.alpha = 0f
//          currentImage = if (currentImage == 1) 4 else currentImage + 1
          currentImage = (3+currentImage+1)%3
          var idImageToShowStr = "th$currentImage"
          var idImageToShowInt =this.resources.getIdentifier(idImageToShowStr,"id",packageName)
          image = findViewById(idImageToShowInt)
          image.alpha=1f
            placeName.text = places[currentImage]

        }

        pre.setOnClickListener{
            var idCurrentImageStr = "th$currentImage"
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageStr,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
//            currentImage = if (currentImage == 1) 4 else currentImage - 1
            currentImage = (3+currentImage-1)%3
            var idImageToShowStr = "th$currentImage"
            var idImageToShowInt =this.resources.getIdentifier(idImageToShowStr,"id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha=1f
            placeName.text = places[currentImage]

        }




    }
}
