package com.azim.unittesting

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class StringDuplicatorTest {


    private lateinit var SUT: StringDuplicator

    @Before
    fun setUp() {
        SUT = StringDuplicator()
    }

    @Test
    fun `Duplicate with 'a' gives 'aa'`(){
        Assert.assertTrue(SUT.duplicate("a") == "aa")
    }

    @Test
    fun `Duplicate long string`(){
        val result = SUT.duplicate("Vasiliy Zukanov")
        assertThat(result, `is`("Vasiliy ZukanovVasiliy Zukanov"))
    }
}