package Excersise250;
import java.util.Scanner;
public class Countnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integer:");
        long num=input.nextLong();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("count:"+count);
    }
}
