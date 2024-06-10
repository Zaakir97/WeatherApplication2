package com.example.weatherapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Set the content view to the main activity layout
        setContentView(R.layout.activity_main)
//sample data for days, minimum temp, maximum temp and conditions
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val minTemps = arrayOf(15, 16, 14, 13, 17, 18, 19)
        val maxTemps = arrayOf(20, 21, 19, 18, 22, 23, 24)
        val conditions = arrayOf("Sunny", "Cloudy", "Rainy", "Stormy", "Windy", "Foggy", "Clear")
//calculate the average temperature for the week
        val totalTemp = (0 until 7).sumBy { (minTemps[it] + maxTemps[it]) / 2 }
        val avgTemp = totalTemp / days.size
//display the average temperature
        findViewById<TextView>(R.id.avgTempTextView).text = "Average Temp: $avgTemp°C"
//get the layout where the buttons will be added
        val daysLayout = findViewById<LinearLayout>(R.id.daysLayout)
        for (i in days.indices) {
            val button = Button(this).apply {
                text = days[i]
                setOnClickListener {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                        putExtra("day", days[i])
                        putExtra("minTemp", minTemps[i])
                        putExtra("maxTemp", maxTemps[i])
                        putExtra("condition", conditions[i])
                    }
                    startActivity(intent)
                }
            }
            daysLayout.addView(button)
        }
    }
}