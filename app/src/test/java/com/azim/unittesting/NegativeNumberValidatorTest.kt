package com.azim.unittesting

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class NegativeNumberValidatorTest{
    lateinit var SUT: NegativeNumberValidator

    @Before
    fun setup(){
        SUT = NegativeNumberValidator()
    }

    @Test
    fun `isNegative with negative number`(){
        Assert.assertTrue(SUT.isNegative(-1))
    }

    @Test
    fun `isNegative with positive number`(){
        Assert.assertFalse(SUT.isNegative(1))
    }

    @Test
    fun `isNegative with ZERO`(){
        Assert.assertFalse(SUT.isNegative(0))
    }
}