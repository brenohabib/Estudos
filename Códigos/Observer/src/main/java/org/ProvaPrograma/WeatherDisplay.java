package org.ProvaPrograma;

public class WeatherDisplay implements EventListener {
    private final String displayId;
    private float temperature;
    private float humidity;
    private float pressure;
    private String connectionStatus;

    public WeatherDisplay(String id) {
        this.displayId = id;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.connectionStatus = "Online";
    }

    @Override
    public void detach() {
        this.temperature = 0.f;
        this.humidity = 0.f;
        this.pressure = 0.f;
        this.connectionStatus = "Offline";
    }

    @Override
    public String toString() {
        return "Display " + displayId + " " + connectionStatus
                + "\n  Temperatura: " + temperature
                + "\n  Umidade: " + humidity
                + "\n  Pressão: " + pressure;
    }
}