package com.azim.unittesting

import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class PositiveNumberValidatorTest {

    lateinit var SUT: PositiveNumberValidator


    @Before
    fun setup(){
        SUT = PositiveNumberValidator()
    }

    @Test
    fun `isPositive for Negative Number`() {
        Assert.assertFalse(SUT.isPositive(-1))
    }

    @Test
    fun `isPositive for Positive Number`() {
        Assert.assertTrue(SUT.isPositive(1))
    }

    @Test
    fun `isPositive for ZERO`() {
        Assert.assertTrue(SUT.isPositive(0))
    }
}