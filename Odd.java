package Excersise250;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter the terms");
        {
            Scanner Obj = new Scanner(System.in);
            n = Obj.nextInt();
            System.out.println("the odd numbers are:");
            for (int i = 1; i <= n; i++) {
                System.out.println(2 * i - 1);
                sum+=2 * i - 1;
            }
            System.out.println("the sum is:" + sum);
        }
    }
}
