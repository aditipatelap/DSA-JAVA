import java.util.Scanner;

/*
A person is eligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is eligible to vote.
 */
public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(IsEligible(age))
            System.out.println("You are eligible for voting.");
        else
            System.out.println("You are not eligible for voting.");
    }
    static boolean IsEligible(int age){
        if(age >= 18)
            return true;
        return false;
    }
}
