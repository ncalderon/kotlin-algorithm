package com.ncalderon.challenges

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArraysKtTest {

    private fun processInput(inputLines: List<String>): Array<Array<Int>> {
        val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

        for (it in inputLines) {
            for (i in 0 until 6) {
                arr[i] = it.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
            }
        }

        return arr
    }

    @Test
    fun hourglassSumTest() {

        val inputLines =
                "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0"

        hourglassSum(processInput(inputLines.split("\n")))
    }

}