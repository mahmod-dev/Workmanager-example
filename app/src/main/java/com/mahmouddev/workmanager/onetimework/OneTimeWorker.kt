package com.mahmouddev.workmanager.onetimework

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class OneTimeWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        TODO("Not yet implemented")
    }
}