package `in`.eduforyou.androidbasics.workmanager

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.WorkRequest
import `in`.eduforyou.androidbasics.R
import java.util.concurrent.TimeUnit

class NotificationActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val channel =
            NotificationChannel("default", "Default", NotificationManager.IMPORTANCE_DEFAULT)
        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager.createNotificationChannel(channel)

        val notificationWorkRequest: WorkRequest = OneTimeWorkRequest.Builder(NotificationWorker::class.java)
            .setInitialDelay(30, TimeUnit.MINUTES)
            .build()
        Log.i("WorkManager",notificationWorkRequest.toString())

        // Schedule the WorkRequest with WorkManager
        WorkManager.getInstance(this).enqueue(notificationWorkRequest)

    }
}

