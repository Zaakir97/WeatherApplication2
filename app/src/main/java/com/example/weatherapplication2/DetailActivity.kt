package com.example.weatherapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //set the content view to the detail activity
        setContentView(R.layout.activity_detail) //retrieve data passed from MainActivity

        val day = intent.getStringExtra("day")
        val minTemp = intent.getIntExtra("minTemp", 0)
        val maxTemp = intent.getIntExtra("maxTemp", 0)
        val condition = intent.getStringExtra("condition")
//display the retrieved data
        findViewById<TextView>(R.id.dayTextView).text = day
        findViewById<TextView>(R.id.minTempTextView).text = "Min Temp: $minTemp°C"
        findViewById<TextView>(R.id.maxTempTextView).text = "Max Temp: $maxTemp°C"
        findViewById<TextView>(R.id.conditionTextView).text = "Condition: $condition"
//set up the back button to finish the activity and return to the previous screen
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}
