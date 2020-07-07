package com.example.fizzbuzz
import java.lang.NumberFormatException

fun main() {
    println("What value would you like to FizzBuzz up to, please enter a number?")
    var max: Int
    try {
        max = Integer.valueOf(readLine())
    }
    catch (e:NumberFormatException){
        println("Error : Input not numerical, setting maximum value to 500")
        max = 500
    }

    println()

    println("Which rules would you like to apply?" +
            "\nEnter your choices as a list only seperated by spaces" +
            "\nOptions are 3, 5, 7, 11, 13 and 17")

    val input: String? = readLine()
    var rules: List<String>? = input?.split(" ".toRegex())

    val allowed = listOf("3", "5", "7", "11", "13", "17")

    for (rule in rules!!){
        if (rule !in allowed){
            println("Error: '" + rule + "' is not an allowed rule" +
                    "\nApplying all rules")
            rules = listOf("3","5","7","11","13","17")
        }
    }

    fizzBuzz(max, rules)
}

fun fizzBuzz(max : Int, rules : List<String>?) {
    var index = 1
    var printLst = mutableListOf<String>()
    println()

    while (index <= max) {
        if (rules != null) {
            if (rules.contains("3") && index.rem(3) == 0 && index.rem(11) != 0) {
                printLst.add("Fizz")
            }
            if (rules.contains("11") && index.rem(13) == 0) {
                printLst.add("Fezz")
            }
            if (rules.contains("11") && index.rem(11) == 0) {
                printLst.add("Bong")
            }
            if (rules.contains("5") && index.rem(5) == 0 && index.rem(11) != 0){
                printLst.add("Buzz")
            }
            if (rules.contains("7") && index.rem(7) == 0 && index.rem(11) != 0){
                printLst.add("Bang")
            }
            if (index.rem(17) == 0){
                printLst.reverse()
            }
        }

        if (printLst.isEmpty()){
            print(index)
        }

        else{
            for (item in printLst) {
                print(item)
            }
        }

        println()
        printLst = mutableListOf<String>()
        index++
    }
}
