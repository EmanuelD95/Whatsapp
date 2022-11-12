package com.emanuel.whatsapp

data class Contact (
    val name: String,
    val message: String,
    val timestamp: String,
    val numberMessage: Int,
    val newMessage: Boolean,
    val avatar: String
)