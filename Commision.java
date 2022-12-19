package Excersise250;

public class Commision {
    public static void main(String[] args) {
        double amount = 10000, commissionPercentage = 20;
        double commission = (commissionPercentage / 100) * amount;
        System.out.println("Commission amount= " + commission);
    }
}