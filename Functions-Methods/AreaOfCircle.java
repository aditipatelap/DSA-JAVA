import java.util.Scanner;

/*
Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Area of Circle: "+String.format("%.2f",area(radius)));
    }
    static double area(int r){
        return (Math.PI*Math.pow(r,2));
    }
}
