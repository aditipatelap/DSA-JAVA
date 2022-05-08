package Intermediate_Java;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units of this month: ");
        int units = sc.nextInt();
        double price = 0;
        //if units are lest than 100 than consider pr unit price as a Rs. 4.30
        if (units < 100){
            price = units * 4.30;
        }
        //if units are between 100 and 300 than first 100 unit price is Rs. 4.30 and rest of unit price is Rs. 5
        else if (units < 300){
            price = (100 * 4.30) * ((units - 100) * 5.0);
        }
        //if units are greater than 300 than first 100 unit price is Rs. 4.30 another 200 unit price is Rs. 5and rest of price is Rs. 6.40
        else{
            price = (100 * 4.30) * (200 * 5.0) * ((units - 300) * 6.40);
        }
        System.out.println("Total amount: "+ price);
    }

}
