package com.azim.unittesting

data class Interval(val start: Int,val end: Int) {

    init {
        require(start < end) { "invalid interval range" }
    }
}