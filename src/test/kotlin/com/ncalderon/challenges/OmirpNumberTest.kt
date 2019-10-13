package com.ncalderon.challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class OmirpNumberTest {

    @Test
    fun isPrime() {
        assertEquals(true, OmirpNumber().isPrime(3))
        assertEquals(false, OmirpNumber().isPrime(92))
        assertEquals(true, OmirpNumber().isPrime(97))
    }

    @Test
    fun isOmirp() {
        assertEquals(true, OmirpNumber().isOmirp(92))
        assertEquals(false, OmirpNumber().isOmirp(29))
    }
}
