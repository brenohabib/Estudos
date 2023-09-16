package AtividadesJava.Clean1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first grade: ");
        double grade1 = input.nextDouble();
        
        System.out.print("Enter the weight of the first grade: ");
        double weight1 = input.nextDouble();
        
        System.out.print("Enter the second grade: ");
        double grade2 = input.nextDouble();
        
        System.out.print("Enter the weight of the second grade: ");
        double weight2 = input.nextDouble();
        
        System.out.print("Enter the third grade: ");
        double grade3 = input.nextDouble();
        
        System.out.print("Enter the weight of the third grade: ");
        double weight3 = input.nextDouble();
        
        double weightedAverage = calculateWeightedAverage(grade1, weight1, grade2, weight2, grade3, weight3);
        System.out.println("The weighted average is: " + weightedAverage);

        input.close();
    }
    
    public static double calculateWeightedAverage(
        double grade1, 
        double weight1,

        double grade2, 
        double weight2,
        
        double grade3, 
        double weight3
    ) 
    {
        return (grade1 * weight1 + grade2 * weight2 + grade3 * weight3) / (weight1 + weight2 + weight3);
    }
}
