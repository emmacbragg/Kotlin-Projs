package com.example.fizzbuzz

fun main() {
    fizzBuzz()
}

fun fizzBuzz() {
    var index = 1
    var FB = 0
    while (index <= 100) {
        if (index.rem(11) == 0) {
            print("Bong")
            FB = 1
        }
        else {
        if (index.rem(3) == 0) {
            print("Fizz")
            FB = 1
        }
        if (index.rem(5) == 0){
            print("Buzz")
            FB = 1
        }
        if (index.rem(7) == 0){
            print("Bang")
            FB = 1
        }
        }
        if (FB == 0){
            print(index)
        }
        FB = 0
        println()
        index++
    }
}