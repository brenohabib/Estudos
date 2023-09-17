package AtividadesJava;
import java.util.Scanner;
public class IPTUCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        boolean isRunning = true;
        int propertyCount = 0;
        double taxSum = 0;
        double penaltySum = 0;
        double feeSum = 0;
        double dueSum = 0;

        do {
            Property property = readData(userInput);
            
            double penalty = calculatePenalty(property.getIPTUValue());
            double fees = calculateFees(property.getIPTUValue(), property.getMonthsLate());
            double amountDue = calculateDue(property.getIPTUValue(), penalty, fees);
            
            displayPayment(penalty, fees, amountDue);
            
            propertyCount++;
            taxSum += property.getIPTUValue();
            penaltySum += penalty;
            feeSum += fees;
            dueSum += amountDue;
            
            System.out.println("Do you want to insert another property? (y/n)");
            String response = userInput.next();
            
            if (response.equalsIgnoreCase("n")) {
                isRunning = false;
            }
        } while (isRunning);
        
        displaySummary(propertyCount, taxSum, penaltySum, feeSum, dueSum);
        
        userInput.close();
    }

    private static Property readData(Scanner input) {
        System.out.println("Enter the property number:");
        int propertyNumber = input.nextInt();
            
        System.out.println("Enter the IPTU value:");
        double iptuValue = input.nextDouble();
            
        System.out.println("Enter the number of months late:");
        int monthsLate = input.nextInt();
        
        return new Property(propertyNumber, iptuValue, monthsLate);
    }
    
    private static double calculatePenalty(double iptuValue) {
        return iptuValue * 0.02;
    }
    
    private static double calculateFees(double iptuValue, int monthsLate) {
        return iptuValue * 0.015 * monthsLate;
    }
    
    private static double calculateDue(double iptuValue, double penalty, double fees) {
        return iptuValue + penalty + fees;
    }
    
    private static void displayPayment(double penalty, double fees, double totalDue) {
        System.out.printf("Penalty: %.2f\n", penalty);
        System.out.printf("Fees: %.2f\n", fees);
        System.out.printf("Total amount due: %.2f\n", totalDue);
    }
    
    private static void displaySummary(int propertyCount, double taxSum,
        double penaltySum, double feeSum, double dueSum) {
        System.out.println("Number of properties inserted: " + propertyCount + "\n");
        System.out.printf("Total tax sum: %.2f\n", taxSum);
        System.out.printf("Total penalty sum: %.2f\n", penaltySum);
        System.out.printf("Total Fees sum: %.2f\n", feeSum);
        System.out.printf("Total due sum: %.2f\n", dueSum);
    }
}

class Property {
    private int propertyNumber;
    private double iptuValue;
    private int monthsLate;

    public Property(int propertyNumber, double iptuValue, int monthsLate) {
        this.propertyNumber = propertyNumber;
        this.iptuValue = iptuValue;
        this.monthsLate = monthsLate;
    }

    public int getPropertyNumber() {
        return propertyNumber;
    }

    public double getIPTUValue() {
        return iptuValue;
    }

    public int getMonthsLate() {
        return monthsLate;
    }
}