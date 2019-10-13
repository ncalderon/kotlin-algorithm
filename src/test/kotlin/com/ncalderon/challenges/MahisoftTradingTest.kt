package com.ncalderon.challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MahisoftTradingTest {

    @Test
    fun mahisoftTrading() {
        assertEquals(
            5.0,
            MahisoftTrading().mahisoftTrading(doubleArrayOf(1.0, 2.0, 1.0, 5.0, 2.1, 6.0, 3.0).toTypedArray()),
            0.0
        )
        assertEquals(
            15.0,
            MahisoftTrading().mahisoftTrading(doubleArrayOf(6.0, 7.0, 1.0, 15.0, 1.0, 16.0, 3.0).toTypedArray()),
            0.0
        )
    }
}
