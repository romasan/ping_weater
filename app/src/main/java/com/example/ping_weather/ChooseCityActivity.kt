package com.example.ping_weather

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class ChooseCityActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activitychoosecity)

        val editTextCity = findViewById<EditText>(R.id.editTextCity)
        val buttonSave = findViewById<Button>(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val cityName = editTextCity.text.toString()
            // Сохранение выбранного города в SharedPreferences или другой механизм хранения данных
            // Например: сохранение в SharedPreferences
            val sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            with(sharedPref.edit()) {
                putString("selectedCity", cityName)
                apply()
            }
            // Завершение Activity и возвращение к предыдущему экрану
            finish()
        }
    }
}
