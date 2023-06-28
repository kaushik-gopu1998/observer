package com.observerpattern.client;

import java.util.ArrayList;
import java.util.List;

import com.observerpattern.observer.CurrentConditionsDisplay;
import com.observerpattern.subject.WeatherData;

public class Client {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 90, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
