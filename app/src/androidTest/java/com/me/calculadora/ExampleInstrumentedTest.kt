package com.me.calculadora

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.me.calculadora", appContext.packageName)
    }

    @Test
    fun multiplication_isCorrect(){
        assertEquals(64, 8*8)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(12, 10 + 2)
    }

    @Test
    fun subtraction_isCorrect(){
        assertEquals(8, 16-8)
    }

    @Test
    fun division_isCorrect(){
        assertEquals(600, 1200/2)
    }
}