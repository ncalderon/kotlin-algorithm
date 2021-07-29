package com.ncalderon.challenges.warnup

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RepeatedStringTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun repeatedStringTest() {
        assertEquals(
            7,
            repeatedString("aba", 10)
        )

        assertEquals(
            1000000000000,
            repeatedString("a", 1000000000000)
        )
    }
}