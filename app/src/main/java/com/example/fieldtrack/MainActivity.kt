package com.example.fieldtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRecordVisit = findViewById<Button>(R.id.btn_record_visit)

        btnRecordVisit.setOnClickListener {
            // TODO: Start the RecordVisitActivity


            btnRecordVisit.setOnClickListener {
                val intent = Intent(this, RecordVisitActivity::class.java)
                startActivity(intent)
            }

        }
    }
}