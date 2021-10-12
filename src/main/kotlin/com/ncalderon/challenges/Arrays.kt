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

val matchArrayValueToIndices = { arr: Array<Int> -> arr.map { i -> i - 1 }.toTypedArray() }

fun minimumBribes(q: Array<Int>): Unit {
    val chaoticThreshold = 3
    var bribeCount = 0;

    val qAsIdx = q.map { i -> i - 1 }

    for ((idx, p) in qAsIdx.withIndex()) {
        if (p - idx >= chaoticThreshold) {
            println("Too chaotic")
            return
        }

        for (j in max(p - 1, 0) until idx) {
            if (qAsIdx[j] > p)
                bribeCount++
        }
    }

    println(bribeCount)
}

//private fun swap(arr: Array<Int>, idx: Int): Int {
//    val currentValue = arr[idx]
//    if (currentValue == idx)
//        return 0;
//    else {
//        for ((idx, value) in newArr.withIndex()){
//            if (idx != value)
//        }
//    }
//
//
//}

fun isSorted(arr: Array<Int>): Boolean {
    for (i in 0 until arr.size-1){
        if (arr[i+1] - arr[i] != 1)
            return false;
    }
    return true;
}

fun minimumSwaps(arr: Array<Int>): Int {
    var count = 0
    val currentArr = matchArrayValueToIndices(arr)

    for (i in currentArr.indices){
        while(currentArr[i] != i){
            val temp = currentArr[i]
            currentArr[i] = currentArr[temp-1]
            currentArr[temp-1] = temp
            count++
        }
        println(currentArr.toList())
    }

    return count;


//    print(arr.sliceArray(listOf(3, 1, 2, 0, 4, 5, 6)).toList())
//    return 1
//    for ((idx, value) in newArr.withIndex()){
//        if (idx == value)
//            continue
//
//        for (j in idx until newArr.size-1){
//            if (newArr[j]-newArr[j+1]<0)
//                return 1 + swap(newArr.slice())
//        }
//    }
}

fun solutionA(A: IntArray): Int {
    var smallestPositiveInteger = -1
    var sortedA = A.sortedArray()
    for (i in 0 until sortedA.size-1) {
        val current = sortedA[i]
        val nextCurrent = sortedA[i+1]
        if(current < 0)
            continue

        if (nextCurrent-current > 1) {
            smallestPositiveInteger = current + 1
            break
        }
    }

    return if (smallestPositiveInteger < 0){
        var largestPositiveInteger = sortedA[sortedA.size-1]
        if (largestPositiveInteger < 0)
            1
        else
            largestPositiveInteger+1
    } else {
        smallestPositiveInteger
    }
}

