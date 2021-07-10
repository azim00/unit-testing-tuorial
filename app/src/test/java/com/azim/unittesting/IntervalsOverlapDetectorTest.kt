package com.azim.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class IntervalsOverlapDetectorTest {

    lateinit var SUT: IntervalsOverlapDetector

    @Before
    fun setUp() {
        SUT = IntervalsOverlapDetector()
    }

    @Test
    fun `isOverlap extreme ends should be false`() {
        val start = Interval(0, 10)
        val end = Interval(11, 20)
        assertThat(SUT.isOverlap(start, end))
            .isFalse()

    }

    @Test
    fun `isOverlap extreme ends reverse case false`() {
        val start = Interval(10, 20)
        val end = Interval(0, 9)
        assertThat(SUT.isOverlap(start, end))
            .isFalse()

    }

    @Test
    fun `isOverlap edges touch reverse case false`() {
        val start = Interval(10, 20)
        val end = Interval(0, 10)
        assertThat(SUT.isOverlap(start, end))
            .isFalse()

    }

    @Test
    fun `isOverlap edges are touching should be false`() {
        val start = Interval(0, 10)
        val end = Interval(10, 20)
        assertThat(SUT.isOverlap(start, end))
            .isFalse()

    }

    @Test
    fun `isOverlap onto should be true`() {
        val start = Interval(10, 20)
        val end = Interval(0, 30)
        assertThat(SUT.isOverlap(start, end))
            .isTrue()

    }

    @Test
    fun `isOverlap edges are inside should be false`() {
        val start = Interval(0, 10)
        val end = Interval(9, 20)
        assertThat(SUT.isOverlap(start, end))
            .isTrue()

    }
}