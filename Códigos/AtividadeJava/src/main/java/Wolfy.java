import static java.lang.Math.PI;
import atividade2.Menu;

public class Wolfy {
    public static void main(String[] args) {
        double valor = convertToF(30.0);

        Menu menu = new Menu("Conversores");
        menu.text("Converter 30Cº em Fº: " + String.valueOf(valor) + "Fº", 2).left();
        menu.printMenu();
        menu.input("diga algo: ");

    }
    public static double convertToC(double F) {
        return (F - 32) * ( 5.0 / 9.0);
    }
    public static double convertToF(double C) {
        return (9 * C + 160) / 5;
    }
    public static double volOleo(double Raio, double Altura) {
        return PI * Math.pow(Raio, 2) * Altura;
    }
}
