package Intermediate;
/*
A number whose sum of factors (excluding the number itself) is equal
to the number is called a perfect number.
e.g. number = 496
factors = 1, 2, 4, 8, 16, 31, 62, 124, and 248
sum = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496
Hence, the number 496 is a perfect number.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int n = 495;
        int sum = 0;
        for (int i = 1; i < n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n+" is perfect number.");
        }
        else{
            System.out.println(n+" is not perfect number.");
        }
    }
}