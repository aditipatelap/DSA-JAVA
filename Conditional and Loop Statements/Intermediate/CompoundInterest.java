package Intermediate;
/*
    A = P(1 + (r/100))^t
    C.I. = A - P
    Where, A = final amount
    P = initial principal amount
    r = interest rate
    t = time period
*/
public class CompoundInterest {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 10;
        rate = rate/100;
        int time = 2;
        double finalamount, compound;
        finalamount = principal * Math.pow(1+rate,time);
        compound = finalamount - principal;
        System.out.println("Compound Interest: "+compound);
    }
}