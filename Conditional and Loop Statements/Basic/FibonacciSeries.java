package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    //0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c; // c = a+b
        System.out.print(a + " ");
        System.out.print(b + " ");

        while(n-- > 0){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
