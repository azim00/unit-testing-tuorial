package com.azim.unittesting

class StringReverse {
    fun reverse(input: String): String {
        val charArray = input
            .toCharArray()
        if (charArray.size > 1)
            for (i in 0..charArray.size / 2) {
                val tmp = charArray[i]
                charArray[i] = charArray[charArray.size - i - 1]
                charArray[charArray.size - i - 1] = tmp
            }
        return String(charArray)
    }
}