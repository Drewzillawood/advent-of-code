package day2

import readInput
import java.util.*

fun main() {
    fun parseDirection(input: String): Direction {
        return Direction.valueOf(input.uppercase(Locale.getDefault()))
    }

    fun part1(input: List<String>): Int {
        var x = 0
        var y = 0
        for(i in input) {
            val inputs = i.split(" ")
            when(parseDirection(inputs[0])) {
                Direction.UP -> y -= inputs[1].toInt()
                Direction.DOWN -> y += inputs[1].toInt()
                Direction.FORWARD -> x += inputs[1].toInt()
            }
        }
        return x * y
    }

    val input = readInput("Day02")
    println(part1(input))
}