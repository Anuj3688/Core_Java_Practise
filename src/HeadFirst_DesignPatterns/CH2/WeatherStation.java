package HeadFirst_DesignPatterns.CH2;

import HeadFirst_DesignPatterns.CH2.impl.CurrentConditionDisplay;
import HeadFirst_DesignPatterns.CH2.impl.ForecastDisplay;
import HeadFirst_DesignPatterns.CH2.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(20,50,1);
        weatherData.setMeasurement(26,60,1);
        weatherData.setMeasurement(17,12,1);
    }
}
