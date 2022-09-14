package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count = findViewById<TextView>(R.id.displayCount)

        val upgradeCount = findViewById<Button>(R.id.upgradeBtn)

        var increaseBy = 1

        val addButton = findViewById<Button>(R.id.addToCount)
        addButton.setOnClickListener {
        //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

            counter+=increaseBy
            count.text = counter.toString()

            if(counter > 5) {
                upgradeCount.visibility = View.VISIBLE
                upgradeCount.setOnClickListener {
                    increaseBy = 2
                }
            }

        }


    }

    var counter: Int = 0;

}