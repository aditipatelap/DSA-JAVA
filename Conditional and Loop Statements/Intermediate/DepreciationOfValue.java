package Intermediate;

import java.util.Scanner;
        /*
            v1 = 200, r = 10, time = 2
            in 1st year
            (200*10)/100 = 20 --> value become 200-20 = 180
            in 2nd year
            (180*10)/100 = 18 --> value become 180-18 = 162
            so,
            (200 - (200*0.1)) - ((200 - (200*0.1)) * 0.1)
            (200 -    (20)  ) - ((200 -    (20)  ) * 0.1)
                   (180)      - (     (180)       * 0.1)
                   (180)      -           (18)
             = 162
            //define formula of depreciation value : d
            = (v1 - (v1*r)) - ((v1 - (v1*r)) * r)
            = (v1 - r*v1) - ((v1 - r*v1) * r)
            = (v1 - r*v1) - (r*v1 - r*r*v1)
            = v1 - r*v1 - r*v1 + r*r*v1
            = v1 - 2*r*v1 + r*r*v1
            = r*r*v1 - 2*r*v1 + v1
            = v1(r*r - 2r + 1)
            = v1(r-1)^2 (here, r is less than 1)
            so, d = v1(1-r)^2
        */

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initial value of product: v1
        System.out.print("Initial Value: ");
        double v1 = sc.nextDouble();
        //decreasing rate: r
        System.out.print("Rate of depreciation: ");
        double r = sc.nextDouble();
        r = r/100;
        //time duration (in year)
        System.out.print("Time duration: ");
        int t = sc.nextInt();
        double d = v1 * Math.pow(1-r,t);
        System.out.println( String.format("Depreciation of value: %.3f",d));
    }
}