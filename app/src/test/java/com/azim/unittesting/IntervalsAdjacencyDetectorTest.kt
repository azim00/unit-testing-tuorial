package com.azim.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class IntervalsAdjacencyDetectorTest {

    lateinit var SUT: IntervalsAdjacencyDetector
    @Before
    fun setUp() {
        SUT = IntervalsAdjacencyDetector()
    }

    @Test
    fun `isAdjacent adjecent must be true`(){
        val start = Interval(0,10)
        val end = Interval(10,20)
        assertThat(SUT.isAdjacent(start,end))
            .isTrue()
    }

    @Test
    fun `isAdjacent non touch must be false`(){
        val start = Interval(0,10)
        val end = Interval(12,20)
        assertThat(SUT.isAdjacent(start,end))
            .isFalse()
    }

    @Test
    fun `isAdjacent same start end must be false`(){
        val start = Interval(0,10)
        val end = Interval(0,10)
        assertThat(SUT.isAdjacent(start,end))
            .isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1BeforeInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(8, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1BeforeAndAdjacentToInterval2_trueReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(5, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isTrue()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1OverlapsInterval2OnStart_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(3, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1ContainedWithinInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-4, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1ContainsInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(0, 3)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1EqualsInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-1, 5)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1OverlapsInterval2OnEnd_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-4, 4)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1AfterAndAdjacentToInterval2_trueReturned() {
        val interval1 = Interval(12, 15)
        val interval2 = Interval(5, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isTrue()
    }

    @Test
    @Throws(Exception::class)
    fun isAdjacent_interval1AfterInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-10, -3)
        val result = SUT.isAdjacent(interval1, interval2)
        assertThat(result).isFalse()
    }
}