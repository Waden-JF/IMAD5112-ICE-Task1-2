package com.example.icetask

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)

        val inputTime = findViewById<EditText>(R.id.editText)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnReset = findViewById<Button>(R.id.btReset)
        
        btnSuggest.setOnClickListener {
            val time = inputTime.text.toString().trim().lowercase()
            
            val suggestion = when (time) {
                "morning" -> "Review your notes from yesterday's lecture for 15 minutes."
                "mid morning" -> "Tackle your most difficult assignment while your focus is high."
                "afternoon" -> "Take a 10-minute break, stretch, and drink water."
                "afternoon snack time" -> "Do a quick 5-minute revision quiz."
                "evening" -> "Organize your notes and plan tomorrow."
                "night" -> "Read your goals and prepare your bag for tomorrow."
                else -> "Invalid input. Please enter a valid time of day."
            }
            
            txtResult.text = suggestion
        }

        btnReset.setOnClickListener {
            inputTime.text.clear()
            txtResult.text = ""
        }
    }
}
