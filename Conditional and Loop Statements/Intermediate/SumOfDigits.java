package Intermediate_Java;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int i = num;
        int sum = 0;
        while (i > 0){
            int rem = i%10;
            sum += rem;
            i /= 10;
        }
        System.out.println("Sum of "+num+" is "+sum);
    }
}
