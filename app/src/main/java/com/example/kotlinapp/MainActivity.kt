package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.Roll_button)
        rollbutton.setOnClickListener {
            Toast.makeText(this ,"Button Clicked" , Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {

        val RandomInt = Random().nextInt(6) +1
        val drawableResource = when (RandomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        val diceimage : ImageView = findViewById(R.id.image_View)
        diceimage.setImageResource(drawableResource)
    }
}