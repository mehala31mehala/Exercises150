package Excersise250;

public class Sumofdigits {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(n);
        int sum = 0;
        while(n>0){
        sum = sum + n % 10;
        n = n / 10;
        }
       System.out.println(sum);
    }
    }

