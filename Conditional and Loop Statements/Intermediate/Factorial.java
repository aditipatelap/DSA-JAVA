package Intermediate_Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(num+"! = "+factorial);
    }

}
