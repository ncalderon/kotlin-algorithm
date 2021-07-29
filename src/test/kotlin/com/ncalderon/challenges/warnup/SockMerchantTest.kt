package com.ncalderon.challenges.warnup

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class SockMerchantTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun sockMerchant() {
        val instance = SockMerchant()
        assertEquals(3, instance.sockMerchant(9, intArrayOf(10,20,20,10,10,30,50,10,20).toTypedArray()))
    }
}
