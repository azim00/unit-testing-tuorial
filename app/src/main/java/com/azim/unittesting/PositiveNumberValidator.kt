package com.azim.unittesting

class PositiveNumberValidator {
    fun isPositive(number: Int): Boolean{
        if(number >= 0)
            return true
        return false
    }
}