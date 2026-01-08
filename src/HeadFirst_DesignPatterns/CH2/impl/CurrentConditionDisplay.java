package HeadFirst_DesignPatterns.CH2.impl;

import HeadFirst_DesignPatterns.CH2.DisplayElement;
import HeadFirst_DesignPatterns.CH2.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("The All Boring Current Conditions are as follows:");
        System.out.println("Current Conditions :"+temp+"F with H:"+humidity);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}

