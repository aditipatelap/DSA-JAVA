package Intermediate_Java;

import java.util.Scanner;
    /*
        Combination --> nCr = n! / (r! * (n-r)!)
        Permutation --> nPr = n! / (n-r)!
     */
public class nCr_nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("r: ");
        int r = sc.nextInt();
        int nCr = Fact(n)/ (Fact(r) * Fact(n-r));
        int nPr = Fact(n)/ Fact(n-r);
        System.out.println("nCr: "+ nCr);
        System.out.println("nPr: "+ nPr);

    }
    //factorial
    static int Fact(int num){
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
