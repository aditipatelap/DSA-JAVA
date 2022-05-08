package Intermediate_Java;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total no. of subject: ");
        int sub = in.nextInt();
        int sum = 0;
        int i = sub;
        while (i-- > 0){
            System.out.print("Enter Grade: ");
            sum += in.nextInt();
        }
        int CGPA = sum/sub;
        System.out.println("CGPA: "+CGPA);

    }
}
