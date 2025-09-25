import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter.celsiusToFahrenheit converter = new TemperatureConverter().new celsiusToFahrenheit();
        assertEquals(32.0, converter.convert(0), 0.01);
        assertEquals(212.0, converter.convert(100), 0.01);
        assertEquals(-40.0, converter.convert(-40), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter.fahrenheitToCelsius converter = new TemperatureConverter().new fahrenheitToCelsius();
        assertEquals(0.0, converter.convert(32), 0.01);
        assertEquals(100.0, converter.convert(212), 0.01);
        assertEquals(-40.0, converter.convert(-40), 0.01);
    }

    @Test
    void testKelvinToCelsius() {
        TemperatureConverter.kelvinToCelcius converter = new TemperatureConverter().new kelvinToCelcius();
        assertEquals(0.0, converter.convert(273.15), 0.01);
        assertEquals(100.0, converter.convert(373.15), 0.01);
        assertEquals(-273.15, converter.convert(0), 0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        TemperatureConverter.isExtremeTemperature checker = new TemperatureConverter().new isExtremeTemperature();
        assertTrue(checker.check(-50, "C"));
        assertTrue(checker.check(60, "C"));
        assertFalse(checker.check(20, "C"));
        assertThrows(IllegalArgumentException.class, () -> checker.check(20, "F"));
    }
}