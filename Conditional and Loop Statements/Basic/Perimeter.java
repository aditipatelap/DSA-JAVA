package Basic;

public class Perimeter {
    public static void main(String[] args) {
        //Basic.Perimeter Of Circle
        System.out.println(String.format("%.2f", Circle(4)));
        //Basic.Perimeter Of Equilateral Triangle
        System.out.println(EquilateralTriangle(10));
        //Basic.Perimeter Of Parallelogram
        System.out.println(Parallelogram(7,8));
        // Basic.Perimeter Of Rectangle
        System.out.println(Rectangle(3,4));
        //Basic.Perimeter Of Square
        System.out.println(Square(5));
        //Basic.Perimeter Of Rhombus
        System.out.println(Rhombus(2));
    }

    //Basic.Perimeter Of Circle = 2*pi*r
    static double Circle(int r){
        double perimeter = 2 * Math.PI * r;
        return perimeter;
    }

    //Basic.Perimeter Of Equilateral Triangle = 3*s
    static int EquilateralTriangle(int s){
        int perimeter = 3 * s;
        return perimeter;
    }

    //Basic.Perimeter Of Parallelogram = 2(s+b)
    static int Parallelogram(int s, int b){
        int perimeter = 2 * (s + b);
        return perimeter;
    }

    // Basic.Perimeter Of Rectangle = 2(l+b)
    static int Rectangle(int l, int b){
        int perimeter = 2 * (l + b);
        return perimeter;
    }

    //Basic.Perimeter Of Square = 4*l
    static int Square(int l){
        int perimeter = 4 * l;
        return perimeter;
    }

    //Basic.Perimeter Of Rhombus = 4*s
    static int Rhombus(int s){
        int perimeter = 4 * s;
        return perimeter;
    }

}
