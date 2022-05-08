package Basic;

public class Volume {
    public static void main(String[] args) {
        //Basic.Volume Of Cone
        System.out.println(Cone(3.2,4.4));
        //Basic.Volume Of Prism
        System.out.println(Prism(4,7));
        //Basic.Volume Of Cylinder
        System.out.println(Cylinder(3,8.3));
        //Basic.Volume Of Sphere
        System.out.println(Sphere(8.7));
        //Basic.Volume Of Pyramid
        System.out.println(Pyramid(3, 10));
    }

    //Basic.Volume Of Cone = (1/3)*π*r*r*h
    static double Cone(double r, double h){
        double area = (1/3) * Math.PI * Math.sqrt(r) * h;
        return area;
    }

    //Basic.Volume Of Prism = b*h
    static double Prism(double base,double height){
        double area = base * height;
        return area;
    }

    //Basic.Volume Of Cylinder = π*r*r*h
    static double Cylinder(double r,double h){
        double area = Math.PI * Math.sqrt(r) * h;
        return area;
    }

    //Basic.Volume Of Sphere = (4/3)*π*r*r*r
    static double Sphere(double r){
        double area = (4/3) * Math.PI * Math.pow(r,3);
        return area;
    }

    //Basic.Volume Of Pyramid = (1/3)*l*l*h
    static double Pyramid(double l, double h){
        double area = (1/3) * l * l * h;
        return area;
    }

}
