package Intermediate_Java;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    //Two points are (x1, x2) and (y1, y2) than distance d = √((x2-x1)2 + (y2-y1)2)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("value of x1: ");
        int x1 = scanner.nextInt();
        System.out.print("value of x2: ");
        int x2 = scanner.nextInt();
        System.out.print("value of y1: ");
        int y1 = scanner.nextInt();
        System.out.print("value of y2: ");
        int y2 = scanner.nextInt();
        double distance = 0;
        //d = √((x2-x1)2 + (y2-y1)2)
        distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(String.format("distance: %.2f",distance));
    }
}
