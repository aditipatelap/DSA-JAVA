package Intermediate;

public class ReverseString {
    public static void main(String[] args) {
        String str = "annyeong";
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            reverseStr += ch;
        }
        System.out.println("Reverse String: "+reverseStr);

    }

}