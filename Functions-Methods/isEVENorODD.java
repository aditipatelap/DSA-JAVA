import java.util.Scanner;
/*
Define a program to find out whether a given number is even or odd.
 */
public class isEVENorODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isEvenNumber(number)){
            System.out.println(number+" is EVEN number.");
        }
        if(isOddNumber(number)){
            System.out.println(number+" is ODD number.");
        }

    }
    //Check for even number
    static boolean isEvenNumber(int number) {
        if (number%2 == 0){
            return true;
        }
        return false;
    }
    //Check for odd number
    static boolean isOddNumber(int number) {
        if (number%2 != 0){
            return true;
        }
        return false;
    }
}
