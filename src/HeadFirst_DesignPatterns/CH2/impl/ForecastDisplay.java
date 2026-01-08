package HeadFirst_DesignPatterns.CH2.impl;

import HeadFirst_DesignPatterns.CH2.DisplayElement;
import HeadFirst_DesignPatterns.CH2.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Here is your daily Forecast Guys");
        System.out.println("Current Conditions :"+temp+"F with H:"+humidity+" and Pressure:"+pressure);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure() ;
        display();
    }
}
