package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var result: TextView
    lateinit var toggleButton : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        image = findViewById(R.id.image)
        result = findViewById(R.id.result)


        //the toggle button has two boolean states; the true and false state based on the toggle button
        // the "setOnCHeckedChangeListener " considers the two states after attributing it as
        //"isChecked" option for true or false
        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->

            if (isChecked){
                image.visibility = View.VISIBLE
                result.text = "The text is invisible"
            }else {
                image.visibility = View.VISIBLE
                result.text = "The Image is visible"
            }
        }

    }
}