package com.ncalderon.elementals

import java.math.BigInteger
import kotlin.math.min

fun binarySearch(arr: IntArray, l: Int, r: Int, x: Int): Int {
    if (r < l)
        return -1

    val mid = l + (r-l) / 2

    if (arr[mid] == x)
        return x

    if (arr[mid] > x)
        return binarySearch(arr, l, mid-1, x)

    return binarySearch(arr, mid+1, r, x)
}

fun binarySearch(arr: IntArray, x: Int): Int {
    return binarySearch(arr,0, arr.size-1, x)
}

fun gridTraveler (m: Int, n: Int, memo: MutableMap<String, BigInteger> = mutableMapOf<String,BigInteger>()): BigInteger {
    val key = "$n,$m"
    if (key in memo)
        return memo[key]!!
    if (m == 1 && n == 1) return BigInteger.valueOf(1L)
    if (m == 0 || n == 0) return BigInteger.valueOf(0L)
    memo[key] = gridTraveler(m-1, n, memo) + gridTraveler(m, n-1, memo)
    return memo[key]!!
}

fun segment(x: Int, space: Array<Int>): Int {
     val n = space.size
     var maximum = 0
     for (i in 0 .. n-x){
         val segment = space.sliceArray(i until i+x)
         val minimun = segment.min()!!
         if (minimun > maximum)
             maximum = minimun
     }
     return maximum
}