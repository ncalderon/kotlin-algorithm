package com.ncalderon.challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class SquareRootTest {

    @Test
    fun sqrt() {
        assertEquals(2, SquareRoot().sqrt(4))
        assertEquals(3, SquareRoot().sqrt(9))
    }
}
