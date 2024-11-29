package org.ProvaPrograma;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay("1");
        WeatherDisplay display2 = new WeatherDisplay("2");

        station.registerObserver(display1);
        station.registerObserver(display2);

        station.setMeasurements(25.5f, 65.0f, 1013.1f);
        System.out.println(display1);
        System.out.println(display2);

        station.setMeasurements(27.3f, 70.0f, 1012.5f);
        System.out.println(display1);
        System.out.println(display2);

        station.removeObserver(display1);

        station.setMeasurements(30.0f, 60.0f, 1011.0f);
        System.out.println(display1);
        System.out.println(display2);
    }
}