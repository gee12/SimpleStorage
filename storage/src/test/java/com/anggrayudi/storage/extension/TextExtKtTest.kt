package com.anggrayudi.storage.extension

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.roundToInt

/**
 * Created on 20/08/20
 *
 * @author Anggrayudi H
 */
class TextExtKtTest {

    @Test
    fun count() {
        assertEquals(4, "abcs8abc88habcabci7h".count("abc"))
        assertEquals(6, "87jkakkubaakjnaaa".count("a"))
        assertEquals(0, "87jkakku baakjnaaa".count(""))
        assertEquals(0, "87jka kkubaakjnaaa".count("abc"))
        assertEquals(1, "primary:DCIM/document/primary:DCIM/document/assas/document/as".count("/document/") % 2)
        println(0.5.roundToInt())
    }

    fun String.splitToPairAt(text: String, occurence: Int): Pair<String, String>? {
        var index = indexOf(text)
        if (text.isEmpty() || index == -1 || occurence < 1) {
            return null
        }
        var count = 0
        do {
            count++
            if (occurence == count) {
                return Pair(
                    substring(0, index),
                    substring(index + text.length, length)
                )
            }
            index = indexOf(text, startIndex = index + text.length)
        } while (index in 1 until length)
        return null
    }

    @Test
    fun splitAt() {
        println("asosdisf/doc/safsfsfaf/doc/8hhyjbh".splitToPairAt("/", 2))
    }
}