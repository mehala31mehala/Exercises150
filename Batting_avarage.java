package Excersise250;

public class Batting_avarage {
    public static void main(String[] args) {
        int total_matches,
        total_runs=3500,
        innings=80,
        notout=1;
        double avarage;
        avarage=total_runs/(innings-notout);
        System.out.println(avarage);
    }
}
