package com.ncalderon.virtualmind

import java.util.*


class CustomStack : Stack<Int>() {
    /*
        stack = {5,2,10,1}
        minimun  return 1

        pop() -> 1 -> {5,2,10}
     */

    fun minimun(): Int {
        var minValue = this.peek()
        this.forEach{
            if (it < minValue)
                minValue = it
        }
        return minValue
    }
}

fun solution(arr: IntArray, k: Int): Int {
    /*
        arr = [1,3,5]
        k = 4

        first pair = 5-1 = 4; 4 == k
        first pair = 3-1 = 2; 2 == k
        second pair = 5-3 = 2; 2 == k

        return 2
     */

    var count = 0
    for (element in arr){
        for (secondElement in arr){
            val result = element - secondElement
            if (result == k)
                count++
        }
    }
    return count
}