package Intermediate_Java;

public class BattingAverage {
    public static void main(String[] args) {
        int matches = 5;
        int totalruns = 200;
        int innings = 5;
        int notout = 1;
        double avg = totalruns / (innings - notout);
        System.out.println("Batting Average: "+ avg);
    }
}
