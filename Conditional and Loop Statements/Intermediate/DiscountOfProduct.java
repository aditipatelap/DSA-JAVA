package Intermediate_Java;

public class DiscountOfProduct {
    public static void main(String[] args) {
        int actualcost = 50;//50$
        double discount = 12;//12%
        double finalcost = (actualcost * discount) / 100;
        System.out.println("Actual Price: "+actualcost);
        System.out.println(String.format("Final cost after discount: %.2f",finalcost));
    }
}
