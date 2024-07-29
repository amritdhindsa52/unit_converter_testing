import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionUnitTest {

    @Test
    fun testTemperatureConversion() {
        val result = convertTemperature(0.0)
        assertEquals(32.0, result, 0.0)
    }

    @Test
    fun testLengthConversion() {
        val result = convertLength(1.0)
        assertEquals(3.28084, result, 0.0)
    }

    @Test
    fun testWeightConversion() {
        val result = convertWeight(1.0)
        assertEquals(2.20462, result, 0.0)
    }

    private fun convertTemperature(value: Double): Double {
        return (value * 9/5) + 32
    }

    private fun convertLength(value: Double): Double {
        return value * 3.28084
    }

    private fun convertWeight(value: Double): Double {
        return value * 2.20462
    }
}
