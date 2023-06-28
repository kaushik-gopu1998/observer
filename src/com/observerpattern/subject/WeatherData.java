package com.observerpattern.subject;
import java.util.ArrayList;
import java.util.List;
import com.observerpattern.observer.Observer;
public class WeatherData implements Subject {
	public List<Observer> observers;
	public float temperature;
	public float humidity;
	public float pressure;
	public  WeatherData() {
		this.observers = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature,humidity,pressure);
		}
	}
	public void setMeasurements(float temperature,float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurmentsChanged();
	}
	private void measurmentsChanged() {
		notifyObservers();
	}
}
