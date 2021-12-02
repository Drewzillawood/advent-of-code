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
        var aim = 0
        for(i in input) {
            val inputs = i.split(" ")
            val displacement = inputs[1].toInt()
            when(parseDirection(inputs[0])) {
                Direction.UP -> {
                    aim -= displacement
                }
                Direction.DOWN -> {
                    aim += displacement
                }
                Direction.FORWARD -> {
                    x += displacement
                    y = if(aim == 0) y else y + displacement * aim
                }
            }
        }
        return x * y
    }

    val input = readInput("Day02")
    println(part1(input))
}