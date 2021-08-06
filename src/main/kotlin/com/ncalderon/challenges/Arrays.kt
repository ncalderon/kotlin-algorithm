package com.ncalderon.challenges

import kotlin.math.max

const val max_rows = 6
const val max_columns = 6

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxHourGlassSum = -46
    for (i in 0 until max_rows - 2) {
        for (j in 0 until max_columns - 2) {
            val topIdxRow = i
            val centerIdxRow: Int = i + 1
            val bottomIdxRow = i + 2

            val leftIdxColumn = j
            val centerIdxColumn = j + 1
            val rightIdxColumn = j + 2
            var currentHourGlassSum = arr[topIdxRow][leftIdxColumn] + arr[topIdxRow][centerIdxColumn] +
                    arr[topIdxRow][rightIdxColumn]
            currentHourGlassSum += arr[centerIdxRow][centerIdxColumn]
            currentHourGlassSum += arr[bottomIdxRow][leftIdxColumn] + arr[bottomIdxRow][centerIdxColumn] +
                    arr[bottomIdxRow][rightIdxColumn]

            if (currentHourGlassSum > maxHourGlassSum)
                maxHourGlassSum = currentHourGlassSum
        }
    }

    return maxHourGlassSum
}

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val rotatedIndices = (0 until d).toList()
    val unchangedIndices = (d until a.size).toList()
    val result = a.sliceArray(unchangedIndices.plus(rotatedIndices))
    return result
}

fun minimumBribes(q: Array<Int>): Unit {
    val chaoticThreshold = 3
    var bribeCount = 0;

    val qAsIdx = q.map { i -> i-1 }

    for ((idx, p) in qAsIdx.withIndex()){
        if (p - idx >= chaoticThreshold){
            println("Too chaotic")
            return
        }

        for (j in max(p-1, 0) until idx){
            if (qAsIdx[j] > p)
                bribeCount++
        }
    }

    println(bribeCount)
}

