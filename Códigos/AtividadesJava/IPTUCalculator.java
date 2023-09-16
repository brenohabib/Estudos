package AtividadesJava;
import java.util.Scanner;

public class IPTUCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        boolean running = true;
        int propertyCount = 0;
        double totalOriginalTaxSum = 0;
        double totalPenaltySum = 0;
        double totalFeeSum = 0;
        double totalAmountDueSum = 0;
        

        do {
            Property property = readPropertyData(userInput);
            
            double penalty = calculatePenalty(property.getIPTUValue());
            double fees = calculateFees(property.getIPTUValue(), property.getMonthsLate());
            double totalAmountDue = calculateTotalAmountDue(property.getIPTUValue(), penalty, fees);
            
            displayPaymentDetails(penalty, fees, totalAmountDue);
            
            propertyCount++;
            totalOriginalTaxSum += property.getIPTUValue();
            totalPenaltySum += penalty;
            totalFeeSum += fees;
            totalAmountDueSum += totalAmountDue;
            
            System.out.println("Do you want to insert another property? (y/n)");
            String response = userInput.next();
            
            if (response.equalsIgnoreCase("n")) {
                running = false;
            }
        } while (running);
        
        displayFinancialSummary(propertyCount, totalOriginalTaxSum, totalPenaltySum, totalFeeSum, totalAmountDueSum);
        
        userInput.close();
    }

    private static Property readPropertyData(Scanner input) {
        System.out.println("Enter the property number:");
        int number = input.nextInt();
            
        System.out.println("Enter the IPTU value:");
        double iptuValue = input.nextDouble();
            
        System.out.println("Enter the number of months late:");
        int monthsLate = input.nextInt();
        
        return new Property(number, iptuValue, monthsLate);
    }
    
    private static double calculatePenalty(double iptuValue) {
        return iptuValue * 0.02;
    }
    
    private static double calculateFees(double iptuValue, int monthsLate) {
        return iptuValue * 0.015 * monthsLate;
    }
    
    private static double calculateTotalAmountDue(double iptuValue, double penalty, double Fees) {
        return iptuValue + penalty + Fees;
    }
    
    private static void displayPaymentDetails(double penalty, double Fees, double totalAmountDue) {
        System.out.printf("Penalty: %.2f\n", penalty);
        System.out.printf("Fees: %.2f\n", Fees);
        System.out.printf("Total amount due: %.2f\n", totalAmountDue);
    }
    
    private static void displayFinancialSummary(int propertyCount, double totalOriginalTaxSum,
        double totalPenaltySum, double totalFeeSum, double totalAmountDueSum) {
        System.out.println("Number of properties inserted: " + propertyCount + "\n");
        System.out.printf("Total original tax sum: %.2f\n", totalOriginalTaxSum);
        System.out.printf("Total penalty sum: %.2f\n", totalPenaltySum);
        System.out.printf("Total Fees sum: %.2f\n", totalFeeSum);
        System.out.printf("Total amount due sum: %.2f\n", totalAmountDueSum);
    }
}

class Property {
    private int number;
    private double iptuValue;
    private int monthsLate;

    public Property(int number, double iptuValue, int monthsLate) {
        this.number = number;
        this.iptuValue = iptuValue;
        this.monthsLate = monthsLate;
    }

    public int getNumber() {
        return number;
    }

    public double getIPTUValue() {
        return iptuValue;
    }

    public int getMonthsLate() {
        return monthsLate;
    }
}