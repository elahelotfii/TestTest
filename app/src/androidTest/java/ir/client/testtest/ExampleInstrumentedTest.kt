package ir.client.testtest

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    MainActivity activity;
    @Before
    public fun setup() {
        val new = null
        var activity = new MainActivity ()
    }
     @Test
     public fun CheckNumber() {
         MainActivity.CheckNumber()
         if ()

     }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("ir.client.testtest", appContext.packageName)
    }
}

private infix fun Nothing?.MainActivity(unit: Unit): Any {

}
