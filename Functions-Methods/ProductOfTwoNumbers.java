import java.util.Scanner;

/*
Define a method that returns the product of two numbers entered by user.
 */
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(product(a,b));
    }
    static int product(int a, int b) {
        return a*b;
    }
}
