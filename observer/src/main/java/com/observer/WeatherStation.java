package com.observer;

/**
 * 测试程序
 */
public class WeatherStation {

    public static void main(String[] args) {
        // 被观察者
        WeatherData weatherData = new WeatherData();

        // 注册观察者
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        conditionsDisplay.display();
        weatherData.setMeasurements(82, 70, 29.2f);
        conditionsDisplay.display();
        weatherData.setMeasurements(78, 78, 40.4f);
        conditionsDisplay.display();

    }
}