package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }
    private fun rollDice() {
        Toast.makeText(this, "Dice Rolled",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {

        Toast.makeText(this, "Counted Up",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text.toString().toDoubleOrNull() != null)
        {
            if(resultText.text.toString() == "6")
            {
                resultText.text = "0"
                return
            }

            val countUpInt = resultText.text.toString().toInt() + 1

            resultText.text = countUpInt.toString()

        }
        else
            resultText.text = "1"



    }
}