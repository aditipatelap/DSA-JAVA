/*
Write a function to check if a given triplet is a Pythagorean triplet or not.
A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number
c^2 = a^2 + b^2
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(IsTripletPythagorean(a,b,c));
    }
    static boolean IsTripletPythagorean(int a, int b, int c){
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            return true;
        return false;
    }
}
