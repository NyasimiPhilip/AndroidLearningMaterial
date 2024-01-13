package com.example.workmanagerdemo2

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

// Extend Worker class and pass context and worker parameters to the constructor
class CompressionWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    // This method is called when the WorkManager decides to run the task
    override fun doWork(): Result {
        return try {
            // Retrieve data passed to the worker

            // Simulate a time-consuming task, for example, uploading data
            for (i in 0..300) {
                Log.i("MYTAG", "Downloading $i")
            }

            // Indicate that the work is completed successfully
            Result.success()
        } catch (e: Exception) {
            // Handle exceptions and indicate that the work has failed
            Result.failure()
        }
    }
}
