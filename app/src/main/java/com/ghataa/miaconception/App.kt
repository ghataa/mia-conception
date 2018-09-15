package com.ghataa.miaconception

import android.app.Application
import com.ghataa.miaconception.api.DefaultMessagingService
import com.google.firebase.messaging.FirebaseMessaging

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseMessaging.getInstance().subscribeToTopic(DefaultMessagingService.TOPIC_MESSAGES)
    }
}
