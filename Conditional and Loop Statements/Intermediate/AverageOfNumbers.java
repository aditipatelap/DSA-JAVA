package Intermediate_Java;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total Numbers: ");
        int N = scanner.nextInt();
        int count = N;
        double average = 0;
        while(count-- > 0){
            int num = scanner.nextInt();
            average += num;
            //System.out.println(average);
        }
        average = average/N;
        System.out.println(String.format("Average: %.4f",average));
        //System.out.println("Average: "+average);
    }
}
