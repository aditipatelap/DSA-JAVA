package Basic;

import java.util.*;

public class SubtractProductAndSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = ProductOfDigit(n);
        int sum = SumOfDigit(n);
        int diff = Math.abs(product-sum);// product - sum        System.out.println(product);
        System.out.println(product);
        System.out.println(sum);
        System.out.println(diff);
    }

    //find the product of its digits
    static int ProductOfDigit(int num){
        int res = 1;
        while(num > 0){
            int rem = num%10;
            res *= rem;
            num = num/10;
        }
        return res;
    }

    //find the sum of its digit
    static int SumOfDigit(int num){
        int res = 0;
        while(num > 0){
            int rem = num%10;
            res += rem;
            num = num/10;
        }
        return res;
    }

}
