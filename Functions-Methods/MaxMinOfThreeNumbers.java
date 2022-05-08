import java.util.Scanner;
/*
Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 */
public class MaxMinOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        //Find Maximum
        int max = max(num1, num2,num3);
        //Find Minimum
        int min = min(num1, num2,num3);
        System.out.println("Max: "+max+" and Min:"+min);

    }//end of main method

    //Find Max of given three numbers
    static int max(int num1, int num2, int num3) {
        int max = num1;
        //If num1 > num2
        //there are 2 possibility --> 1.. num1 > num3  and 2.. num3 > num1
        if(num1 > num2){
            //1.. num1 > num2 && num1 > num3
            if(num1 > num3){
                max = num1;
            }
            //2.. num1 > num2 && num3 > num1 --> num3 > num1 > num2
            else{
                max = num3;
            }
        }
        //if condition not satisfy than we can say num2 > num1
        //So, there are again 2 possibility --> 1..  num2 > num3 2.. num3 > num2
        else{
            //1.. num2 > num1 && num2 > num3
            if (num2 > num3){
                max = num2;
            }
            ///2.. num2 > num1 && num3 > num2 --> num3 > num2 > num1
            else{
                max = num3;
            }
        }
        return max;
    }

    //Find Min of given three numbers
    static int min(int num1, int num2, int num3){
        int min = num1;
        //IF num1 < num2
        //there are 2 possibility --> 1.. num1 < num3  and 2.. num3 < num1
        if(num1 < num2){
            //1.. num1 < num2 && num1 < num3
            if(num1 < num3){
                min = num1;
            }
            //2.. num1 < num2 && num3 < num1 --> num3 < num1 < num2
            else{
                min = num3;
            }
        }
        //if condition not satisfy than we can say num2 < num1
        //So, there are again 2 possibility --> 1..  num2 < num3 2.. num3 < num2
        else{
            //1.. num2 < num1 && num2 < num3
            if (num2 < num3){
                min = num2;
            }
            ///2.. num2 < num1 && num3 < num2 --> num3 < num2 < num1
            else{
                min = num3;
            }
        }
        return min;
    }

}
