package Intermediate_Java;

import java.util.Scanner;
    /*
    LCM (Least Common Multiple):
    The LCM of two numbers is the smallest positive integer which is divisible by both numbers.
    HCF (Highest common Factor) or GCD(Greatest common divisor)
    HCF is also known as Greatest common divisor, HCF of two numbers is the largest positive integer that divides both the numbers.
    Here, LCM = (n1*n2)/GCD
     */
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number1: ");
        int a = sc.nextInt();
        System.out.print("number2: ");
        int b = sc.nextInt();
        int hcf = 1, lcm;
        //calculate HCF(GCD)
        for (int i = 1; i <= a || i <= b; i++){
            if (a%i == 0 && b%i == 0){
                hcf = i;
            }
        }
        //calculate LCM
        lcm = (a * b)/hcf;
        System.out.println("HCF(GCD): "+hcf);
        System.out.println("LCM: "+lcm);

    }
}
