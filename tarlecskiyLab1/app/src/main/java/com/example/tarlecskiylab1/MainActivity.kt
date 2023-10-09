package com.example.tarlecskiylab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnChangeAndCount).setOnClickListener {
            val sourceNumbers = findViewById<EditText>(R.id.sourceNumbers)
            val sourceData = sourceNumbers
                .text
                .split(" ")
                .map(String::toInt)

            val valueZ = findViewById<EditText>(R.id.valueZ)
                .text
                .split(" ")
                .map(String::toInt).first()

            val newData = Executor.execute(sourceData, valueZ)

            sourceNumbers.setText(newData.newItems.joinToString(separator = " "))
            findViewById<TextView>(R.id.numberOfReplacements)
                .text = newData.numberOfReplacements.toString()
        }
    }
}