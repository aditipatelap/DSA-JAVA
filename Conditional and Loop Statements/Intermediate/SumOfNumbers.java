package Intermediate;

import java.util.Scanner;

/*
Write a program to print the sum of negative numbers,
sum of positive even numbers and the sum of positive odd numbers
from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sn = 0; //Sum of negative numbers
        int spe = 0;//Sum of positive even numbers
        int spo = 0;//Sum of positive odd numbers
        while (n != 0){
            if(n < 0)
                sn += n;
            else{
                if(n%2 == 0) //even number
                    spe += n;
                else //odd number
                    spo += n;
            }
            n = scanner.nextInt();
        }
        System.out.println("Sum of negative numbers: "+sn);
        System.out.println("Sum of positive even numbers: "+spe);
        System.out.println("Sum of positive odd numbers: "+spo);
    }
}