package Excersise250;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
        fact=fact*i;
}
        System.out.println(fact);
}
}