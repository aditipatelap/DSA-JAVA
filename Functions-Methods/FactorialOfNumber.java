import java.util.Scanner;

/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) * n.
 */
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number+"! = "+Factorial(number));
    }
    static int Factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
