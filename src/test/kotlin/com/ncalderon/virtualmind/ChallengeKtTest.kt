package com.ncalderon.virtualmind

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ChallengeKtTest {

    @Test
    fun solution() {
        assertEquals(
            2,
            com.ncalderon.virtualmind.solution(intArrayOf(1,3,5),2)
        )
    }
}