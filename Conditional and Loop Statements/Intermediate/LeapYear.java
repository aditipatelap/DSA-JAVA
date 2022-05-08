package Intermediate;

import java.util.Scanner;
/*
A leap year is exactly divisible by 4 except for century years (years ending with 00).
The century year is a leap year only if it is perfectly divisible by 400.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leap = false;
        //check leap year is or not
        if (year % 400 == 0){
            leap = true;
        }
        else if(year%4 == 0 && year%100 != 0){
            leap = true;
        }
        //output
        if (leap == true) {
            System.out.println(year + " is leap year.");
        }
        else{
            System.out.println(year + " is not leap year.");
        }

    }
}