package com.hello

fun main() {
    //println("helloWorld")
    Human().hello()
    val h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}