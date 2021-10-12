package com.ncalderon.elementals

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElementalTests {

    private fun newBinarySearch(arr: IntArray, x: Int): Int {
        return binarySearchOptimize(arr, 0, arr.size-1, x)
    }

    private fun binarySearchOptimize(arr: IntArray, l: Int, r: Int, x: Int): Int {
        if (r < l){
            return -1
        }

        val mid = l + (r-l)/2

        return if (arr[mid] == x)
            arr[mid]
        else if (arr[mid] < x)
            binarySearchOptimize(arr, mid+1, r, x)
        else
            binarySearchOptimize(arr, l, mid-1, x)

    }

    @Test
    fun binarySearchTest(){
        assertEquals(
            40,
            binarySearch(
                (0 .. 2000).toList().toIntArray(),
                40
            )
        )
    }

    @Test
    fun binarySearchTestNew(){
        assertEquals(
            5,
            newBinarySearch(
                (0 .. 100).toList().toIntArray(),
                5
            )
        )
    }

    @Test
    fun segmentTest() {
        assertEquals(
            4,
            segment(2, arrayOf(8, 2, 4, 6))
        )
    }
}