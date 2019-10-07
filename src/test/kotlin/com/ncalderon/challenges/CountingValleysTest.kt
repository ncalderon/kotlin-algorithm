package com.ncalderon.challenges

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CountingValleysTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun countingValleys() {
        assertEquals(1, CountingValleys().countingValleys(8, "UDDDUDUU"))
    }
}
