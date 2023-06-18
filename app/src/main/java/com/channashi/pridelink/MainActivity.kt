package com.channashi.pridelink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login);

        var loginBtn = findViewById<Button>(R.id.loginBtn);
        loginBtn.setOnClickListener{
            val intent = Intent(this, PlanActivity::class.java)
            startActivity(intent)
        }

    }
}
