package com.channashi.pridelink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personalized_plan)
        var continueBtn = findViewById<ImageButton>(R.id.continueBtn);
        continueBtn.setOnClickListener{
            val intent = Intent(this, MentorActivity::class.java)
            startActivity(intent)
        }
    }
}