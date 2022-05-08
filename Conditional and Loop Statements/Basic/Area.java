package Basic;

import java.util.*;
public class Area {
    public static void main(String[] args) {
        //area of circle
        System.out.println(Circle(23.6));
        //area of triangle
        System.out.println(Triangle(12,4));
        //area of rectangle
        System.out.println(Rectangle(4,5));
        //area of Isosceles Triangle
        System.out.println(IsoscelesTriangle(3.3));
        //area of Parallelogram
        System.out.println(Parallelogram(3,4));
        //area of Rhombus
        System.out.println(Rhombus(2.5,67));
        //area of Equilateral Triangle
        System.out.println(EquilateralTriangle(6));

    }

    //area of circle = PI*r*r
    static double Circle(double radius){
        double area = Math.PI * Math.sqrt(radius);
        return area;
    }

    //area of triangle = 1/2*b*h
    static double Triangle(double b, double h){
        double area = 0.5 * b * h;
        return area;
    }

    //area of rectangle = l*b
    static double Rectangle(double l, double b){
        double area = l * b;
        return area;
    }

    //area of Isosceles Triangle = 1/2*a*a
    static double IsoscelesTriangle(double l){
        double area = 0.5 * Math.sqrt(l);
        return area;
    }

    //area of Parallelogram = h*b
    static double Parallelogram(double h, double b){
        double area = h * b;
        return area;
    }

    //area of Rhombus = 1/2*p*q
    static double Rhombus(double p, double q){
        double area = 0.5 * p * q;
        return area;
    }

    //area of Equilateral Triangle = (squrt(3)/4)*s*s
    static double EquilateralTriangle(double s){
        double area = (Math.pow(3,0.5)/4) * Math.sqrt(s);
        return area;
    }

}
