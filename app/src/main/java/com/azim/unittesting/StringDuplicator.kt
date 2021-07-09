@file:Suppress("SpellCheckingInspection")

package com.azim.unittesting

class StringDuplicator {
    /**
     * @return concatenation of the argument with itself e.g. "hi" -> "hihi"
     */
    fun duplicate(string: String): String {
        return string + string
    }
}