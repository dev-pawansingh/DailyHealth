package com.pawansingh.dailyhealth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var tvDailyTip: TextView
    private lateinit var btnNextTip: Button
    private lateinit var btnSetPreferences: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvDailyTip = findViewById(R.id.tvDailyTip)
        btnNextTip = findViewById(R.id.btnNextTip)
        btnSetPreferences = findViewById(R.id.btnSetPreferences)

        // Show a random tip on app launch
        showRandomTip()

        // Button to show the next tip
        btnNextTip.setOnClickListener {
            showRandomTip()
        }

        // Button to open PreferencesActivity
        btnSetPreferences.setOnClickListener {
            val intent = Intent(this, PreferencesActivity::class.java)
            startActivity(intent)
        }
        scheduleDailyNotification()
    }

    private fun showRandomTip() {
        val randomTip = TipRepository.getRandomTip()
        tvDailyTip.text = randomTip.tip
    }

    private fun scheduleDailyNotification() {
        // Create a periodic work request that repeats every 24 hours
        val notificationWorkRequest = PeriodicWorkRequestBuilder<NotificationWorker>(1, TimeUnit.DAYS)
            .build()

        // Enqueue the work request
        WorkManager.getInstance(this).enqueue(notificationWorkRequest)
    }
}