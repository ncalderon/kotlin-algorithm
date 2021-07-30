package com.ncalderon.challenges

import java.lang.StringBuilder

class test {
    private fun testMethod() {
        val text = StringBuilder("testing")
        val numIterations = text.length
        for (i in 0 until numIterations - 2) {
            print(text[i])
        }
    }
}