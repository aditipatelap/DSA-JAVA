/*
Write a function that returns the sum of first n natural numbers.
we can formula sum = n*(n-1)/2
 */
public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Sum of first "+ n +" numbers : "+Sum(n));
    }
    static int Sum(int n){
        return (n*(n+1))/2;
    }
}
