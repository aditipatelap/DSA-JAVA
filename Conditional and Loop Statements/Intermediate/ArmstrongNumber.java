package Intermediate;
/*
    153 is armstrong numbe1r bcz,
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (IsArmstrong(i))
                System.out.print(i + " ");
        }
    }

    //Check number is armstrong or not
    static boolean IsArmstrong(int num) {
        int ans = 0;
        int i = num;
        while (i > 0) {
            int rem = i%10;
            ans += Math.pow(rem, 3);
            i /= 10;
        }
        if (ans == num)
            return true;
        else
            return false;
    }

}