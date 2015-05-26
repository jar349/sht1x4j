package com.johnruiz.sht1x4j;

public class Sht1xSensor {

    native float getTemperatureInFahrenheit();
    native float getTemperatureInCelcius();
    native float getHumidity();

    static {
        System.loadLibrary("sht1x-java");
    }

    static public void main(String argv[]) {

        Sht1xSensor sensor = new Sht1xSensor();
        float temp = sensor.getTemperatureInFahrenheit();
        float humidity = sensor.getHumidity();

        System.out.println("The current temperature (degrees F) is: " + temp);
        System.out.println("The current relative humidity is: " + humidity);
    }
}
