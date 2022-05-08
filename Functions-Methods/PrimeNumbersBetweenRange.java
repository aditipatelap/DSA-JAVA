/*
Write a function that returns all prime numbers between two given numbers.
 */
public class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        int r1 = 1;
        int r2 = 100;
        for (int i = r1; i <= r2 ; i++) {
            if (Prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean Prime(int num) {
        for (int i = 2; i*i < num; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
