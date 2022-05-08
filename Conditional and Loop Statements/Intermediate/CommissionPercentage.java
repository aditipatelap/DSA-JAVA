package Intermediate;

public class CommissionPercentage {
    public static void main(String[] args) {
        double amount = 30000;
        double commissionrate = 5;
        double totalcommission = (amount * commissionrate) / 100;
        System.out.println(String.format("Total commission amount: %.2f", totalcommission));

    }
}