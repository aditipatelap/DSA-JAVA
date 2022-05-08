/*
Write a function to find if a number is a palindrome or not. Take number as parameter.
if original number = reverse number than it's called as a palindrome number.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (IsPalindrome(number)){
            System.out.println(number+" is palindrome number.");
        }
        else{
            System.out.println(number+" is not palindrome number.");
        }
    }
    static boolean IsPalindrome(int number) {
        int reverse = 0;
        int i = number;
        while (i > 0){
            int rem = i % 10;
            reverse = (reverse*10) + rem;
            i /= 10;
        }
        if(reverse == number)
            return true;
        return false;
    }
}
