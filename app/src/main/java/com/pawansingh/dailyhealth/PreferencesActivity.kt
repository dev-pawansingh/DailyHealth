package com.pawansingh.dailyhealth

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PreferencesActivity : AppCompatActivity() {

    private lateinit var cbFitness: CheckBox
    private lateinit var cbNutrition: CheckBox
    private lateinit var cbMentalHealth: CheckBox
    private lateinit var btnSavePreferences: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preferences)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        cbFitness = findViewById(R.id.cbFitness)
        cbNutrition = findViewById(R.id.cbNutrition)
        cbMentalHealth = findViewById(R.id.cbMentalHealth)
        btnSavePreferences = findViewById(R.id.btnSavePreferences)

        // Load saved preferences
        loadPreferences()

        // Save preferences on button click
        btnSavePreferences.setOnClickListener {
            savePreferences()
        }
    }

    private fun loadPreferences() {
        val sharedPreferences = getSharedPreferences("UserPreferences", MODE_PRIVATE)
        cbFitness.isChecked = sharedPreferences.getBoolean("Fitness", false)
        cbNutrition.isChecked = sharedPreferences.getBoolean("Nutrition", false)
        cbMentalHealth.isChecked = sharedPreferences.getBoolean("MentalHealth", false)
    }

    private fun savePreferences() {
        val sharedPreferences = getSharedPreferences("UserPreferences", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("Fitness", cbFitness.isChecked)
        editor.putBoolean("Nutrition", cbNutrition.isChecked)
        editor.putBoolean("MentalHealth", cbMentalHealth.isChecked)
        editor.apply()
        Toast.makeText(this, "Preferences saved!", Toast.LENGTH_SHORT).show()
    }

}