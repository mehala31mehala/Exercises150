package Excersise250;
public class Compound_intrest {
    public static void main(String[] args) {
        double amount=0,
               principle=1000,
                rate=10,
                time=3,ci;
        System.out.println("Principle:"+principle);
        System.out.println("Rate:"+rate);
        System.out.println("Time:"+time);
        amount=principle*(Math.pow(1+rate/100,3));
        ci=amount-principle;
        System.out.println("Amount:"+amount);
        System.out.println("Compound principle:"+ci);
    }
}
