package AtividadesJava.Clean1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input your weigth in kg: ");
        double weigth = input.nextDouble();
        
        System.out.print("input your height in meters: ");
        double height = input.nextDouble();
        
        double imc = calcIMC(weigth, height);
        System.out.println("Your IMC is: " + imc);

        input.close();
    }
    
    public static double calcIMC(double weigth, double height) {
        return weigth / (height * height);
    }
}
