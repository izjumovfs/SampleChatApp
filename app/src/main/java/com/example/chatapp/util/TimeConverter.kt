package com.example.chatapp.util

import java.sql.Date
import java.text.SimpleDateFormat


fun getDateTime(timestamp: Long): String? {
    try {
        val sdf = SimpleDateFormat("MM-dd-yyyy hh-mm-ss")
        val netDate = Date(timestamp)
        return sdf.format(netDate)
    } catch (e: Exception) {
        return ""
    }
}

