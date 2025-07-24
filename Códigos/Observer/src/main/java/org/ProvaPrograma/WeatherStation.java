package org.ProvaPrograma;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements EventManager {
    private final List<EventListener> listeners;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        listeners = new ArrayList<>();
    }

    @Override
    public void registerObserver(EventListener o) {
        listeners.add(o);
    }

    @Override
    public void removeObserver(EventListener o) {
        o.detach();
        listeners.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (EventListener o : listeners) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
