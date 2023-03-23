package com.observer;

/**
 * 布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private float pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);      //注册观察者
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity and " + pressure + "Pa pressure");
    }
}