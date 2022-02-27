package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)


            val btnRoll :Button = findViewById(R.id.btnRoll)
            val btnClear : Button = findViewById(R.id.btnClear)
            //val btnRoll = findViewById<Button>(R.id.btnRoll)


        btnRoll.setOnClickListener(){
            //Toast.makeText(applicationContext, "Hello", Toast.LENGTH_LONG).show()//length long = duration | toast = pop up message

            //val no :Int = (1..6).random()
            //tvResult.text = no.toString()
            rollDice()
        }

        btnClear.setOnClickListener(){
            diceImage.setImageResource(R.drawable.empty_dice)
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }

}