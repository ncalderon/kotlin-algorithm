package com.ncalderon.challenges.warnup

import com.ncalderon.challenges.warnup.JumpingOnClouds
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class JumpingOnCloudsTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun jumpingOnClouds() {
        assertEquals(
            JumpingOnClouds().jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)),
            4
        )

        assertEquals(
            JumpingOnClouds().jumpingOnClouds(arrayOf(0, 0, 0, 0, 1, 0)),
            3
        )
    }
}