fun main() {
    fun ints(input: List<String>) = input.map { it.toInt() }.toTypedArray()

    fun part1(input: List<String>): Int {
        var count = 0
        val intArr = ints(input)
        for(i in intArr.indices) {
            if (i < intArr.size - 1 && intArr[i] < intArr[i + 1]) {
                count++
            }
        }
        return count
    }

    fun window (input: List<Int>, i: Int): Int {
        return input[i] + input[i + 1] + input[i + 2]
    }

    fun part2(input: List<String>): Int {
        var count = 0
        val intArr = ints(input).toList()
        for(i in intArr.indices) {
            if(i > 0 && i < intArr.size - 3)
                if (window(intArr, i) < window(intArr, i + 1))
                    count++
        }
        return count
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
