package com.ncalderon.challenges

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ArraysKtTest {

    private fun processInput(inputLines: List<String>): Array<Array<Int>> {
        val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

        for (i in 0 until 6) {
            arr[i] = inputLines.get(i).trimEnd().split(" ").map { s -> s.toInt() }.toTypedArray()
        }
        return arr
    }

    @Test
    fun hourglassSumTest() {

        var inputLines =
            "1 1 1 0 0 0\n" +
                    "0 1 0 0 0 0\n" +
                    "1 1 1 0 0 0\n" +
                    "0 0 2 4 4 0\n" +
                    "0 0 0 2 0 0\n" +
                    "0 0 1 2 4 0"

        var actual = hourglassSum(processInput(inputLines.split("\n")))
        assertEquals(19, actual)

        inputLines = "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 0 0 0 0\n" +
                "0 0 0 0 0 0\n" +
                "0 0 0 0 0 0"

        actual = hourglassSum(processInput(inputLines.split("\n")))
        assertEquals(7, actual)

        inputLines = "-9 -9 -9 1 1 1\n" +
                "0 -9 0 4 3 2\n" +
                "-9 -9 -9 1 2 3\n" +
                "0 0 8 6 6 0\n" +
                "0 0 0 -2 0 0\n" +
                "0 0 1 2 4 0"

        actual = hourglassSum(processInput(inputLines.split("\n")))
        assertEquals(28, actual)

        inputLines = "-1 -1 0 -9 -2 -2\n" +
                "-2 -1 -6 -8 -2 -5\n" +
                "-1 -1 -1 -2 -3 -4\n" +
                "-1 -9 -2 -4 -4 -5\n" +
                "-7 -3 -3 -2 -9 -9\n" +
                "-1 -3 -1 -2 -4 -5"

        actual = hourglassSum(processInput(inputLines.split("\n")))
        assertEquals(-6, actual)
    }

    @Test
    fun rotLeftTest(){
        assertEquals("5 1 2 3 4", rotLeft("1 2 3 4 5".split(" ").map { s -> s.toInt() }.toTypedArray(), 4)
            .joinToString(" "))
    }

    @Test
    fun minimumBribesTest(){
        minimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4)) // 7
        minimumBribes(arrayOf(2, 1, 5, 3, 4)) // 3
        minimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4)) // 7
        minimumBribes(arrayOf(2, 1, 5, 3, 4)) // 3
        minimumBribes(arrayOf(2, 5, 1, 3, 4)) // Too chaotic

    }
}