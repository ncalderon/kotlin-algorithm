package com.ncalderon.virtualmind

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CustomStackTest {
    @Test
    fun testChallenge() {
        val customStack = CustomStack()
        intArrayOf(5, 2, 10, 1).forEach {
            customStack.push(it)
        }
        assertEquals(
            1,
            customStack.minimun()
        )
        assertEquals(
            1,
            customStack.pop()
        )
        assertEquals(
            2,
            customStack.minimun()
        )
    }
}