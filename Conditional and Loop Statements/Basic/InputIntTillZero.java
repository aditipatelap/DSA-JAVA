package Basic;

import java.util.Scanner;

public class InputIntTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max;
        int number = sc.nextInt();
        max = number;
        while (number != 0) {
            sum += number;
            if(number > max)
                max = number;
            number = sc.nextInt();
        }
        System.out.println("Sum: "+sum);
        System.out.println("Largest number: "+ max);
        //Print Largest number
    }
}
