package com.example.androidunittest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun TestEnglish(){
        val w = Words.Words();
        val expected = "Crap"
        val actual = w.English()
        assertEquals(expected, actual)
    }

    @Test
    fun TestAfri(){
        val w = Words.Words();
        val expected = "kak"
        val actual = w.Afri()
        assertEquals(expected, actual)
    }

    @Test
    fun TestXhosa(){
        val w = Words.Words();
        val expected = "ukunya"
        val actual = w.Xhosa()
        assertEquals(expected, actual)
    }
}