package com.vogella.android.temperatureconverter;

/**
 * Created by SyberDeskTop on 2/26/2018.
 */

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
