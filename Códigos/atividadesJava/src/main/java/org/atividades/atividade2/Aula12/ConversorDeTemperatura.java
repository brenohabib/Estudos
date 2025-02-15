package atividade2.Aula12;

public class ConversorDeTemperatura {
    public static double converterCelsiusParaFahrenheit(double celcius) throws TemperaturaInvalidaException {
        if (celcius < -273.15) {
            throw new TemperaturaInvalidaException("Não existe temperatura abaixo do zero absoluto.");
        }
        return celcius * (9/5) + 32;
    }
}

class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String message) {
        super(message);
    }
}
