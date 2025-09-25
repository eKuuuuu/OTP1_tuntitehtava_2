public class TempCalcMain {
    public static void main(String[] args) {
        TemperatureConverter.celsiusToFahrenheit converter1 = new TemperatureConverter().new celsiusToFahrenheit();
        System.out.println("0 Celsius to Fahrenheit: " + converter1.convert(0));

        TemperatureConverter.fahrenheitToCelsius converter2 = new TemperatureConverter().new fahrenheitToCelsius();
        System.out.println("32 Fahrenheit to Celsius: " + converter2.convert(32));

        TemperatureConverter.kelvinToCelcius converter3 = new TemperatureConverter().new kelvinToCelcius();
        System.out.println("273.15 Kelvin to Celsius: " + converter3.convert(273.15));

        TemperatureConverter.isExtremeTemperature checker = new TemperatureConverter().new isExtremeTemperature();
        System.out.println("Is -50 Celsius extreme? " + checker.check(-50, "C"));
    }
}
