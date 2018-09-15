package com.ghataa.miaconception.api

import com.google.firebase.messaging.FirebaseMessagingService

class DefaultMessagingService : FirebaseMessagingService() {

    companion object {
        val TOPIC_MESSAGES = "messages"
    }
}
