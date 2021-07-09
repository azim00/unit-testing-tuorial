package com.azim.unittesting

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test


internal class StringReverseTest {

    lateinit var SUT: StringReverse

    @Before
    fun setup() {
        SUT = StringReverse()
    }

    @Test
    fun `reverse string input 'ABC' expect 'CAB'`() {
        assertTrue(SUT.reverse("ABC") == "CBA")
    }

    @Test
    fun `reverse string input 'A' expect 'A'`() {
        assertTrue(SUT.reverse("A") == "A")
    }

    @Test
    fun `reverse string input '' expect ''`() {
        assertTrue(SUT.reverse("") == "")
    }
}