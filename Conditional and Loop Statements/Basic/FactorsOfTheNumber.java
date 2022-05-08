package Basic;

import java.util.Scanner;
//24 --> 1, 2, 3, 4, 6, 8, 12, 24
public class FactorsOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }//main method end
}
