package com.example.hciapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform