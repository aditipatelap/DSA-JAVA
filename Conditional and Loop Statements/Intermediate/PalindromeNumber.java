package Intermediate;
/*
    n = 14641
    rev of n = 14641
    both are same that's way it's call palindrome number.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12355321;
        int rev = 0;
        int temp = n;
        while (temp > 0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp /= 10;
        }
        if (rev == n){
            System.out.println(n+" is palindrome number.");
        }
        else{
            System.out.println(n+" is not palindrome number.");
        }
    }
}