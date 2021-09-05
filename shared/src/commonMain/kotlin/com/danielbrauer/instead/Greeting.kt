package com.danielbrauer.instead

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}