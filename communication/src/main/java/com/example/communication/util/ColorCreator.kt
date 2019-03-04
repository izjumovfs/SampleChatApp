package com.example.communication.util

import java.util.*

fun getRandomColor(): String {
    val r = Random()
    val sb = StringBuffer("#")
    while (sb.length < 7) {
        sb.append(Integer.toHexString(r.nextInt()))
    }
    return sb.toString().substring(0, 7)
}