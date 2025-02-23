package com.pawansingh.dailyhealth

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotificationWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        showNotification()
        return Result.success()
    }

    private fun showNotification() {
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channelId = "daily_health_tips"
        val notificationChannel = NotificationChannel(
            channelId,
            "Daily Health Tips",
            NotificationManager.IMPORTANCE_DEFAULT
        )
        notificationManager.createNotificationChannel(notificationChannel)

        val notification = NotificationCompat.Builder(applicationContext, channelId)
            .setContentTitle("Daily Health Tip")
            .setContentText(TipRepository.getRandomTip().tip)
            .setSmallIcon(R.drawable.ic_notification)
            .build()

        notificationManager.notify(1, notification)
    }
}