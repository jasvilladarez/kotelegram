package io.github.jasvilladarez.telegram.listener

import io.github.jasvilladarez.telegram.model.Message

interface UpdateListener {

    fun onMessageReceived(message: Message)
}