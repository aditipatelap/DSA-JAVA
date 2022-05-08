package Intermediate_Java;

import java.util.Scanner;
/*
Future value is a value of an investment or asset on a specific date in the future.
To put it another way, the future value is the amount of money a given investment
will be worth after a certain period, assuming a specific rate of return (interest rate).
This is same as compound interest.
 */
public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Present  Value: ");
        int pv = sc.nextInt();
        System.out.print("Interest rate: ");
        double r = sc.nextInt();
        r = r/100;
        System.out.print("Time period: ");
        int t = sc.nextInt();
        double fv = 0;//Future Value
        fv = pv*Math.pow(1+r,t);
        System.out.println(String.format("Future Value: %.4f",fv));

    }
}
