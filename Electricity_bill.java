package Excersise250;

public class Electricity_bill {
    public static void main(String[] args) {
        int unit = 280;
        double amount = 0;
        if (unit < 100) {
            amount = unit * 1.20;
            System.out.println("Bill to pay:" + amount);
        } else if (unit < 300) {
            amount = 100 * 1.20 + (unit - 100) * 2;
            System.out.println("Bill to pay:" + amount);
        } else if (unit > 300) {
            amount = 100 * 1.20 + 200 * 2 + (unit - 300) * 3;
            System.out.println("Bill to pay:" + amount);

        }
    }
}