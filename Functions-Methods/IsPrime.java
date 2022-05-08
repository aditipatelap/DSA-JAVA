import java.util.Scanner;

/*
Define a method to find out if a number is prime or not.
 */
public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Prime(num));
    }
    static boolean Prime(int num) {
        for (int i = 2; i*i < num; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
