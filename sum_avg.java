package Excersise250;
import java.util.Scanner;
public class sum_avg {
    public static void ain(String[] args) {
        int sum = 0, num = 0;
        int avrg;
        {
            System.out.println("enter any 5 numbers");
            for (int i = 0; i < 5; i++) {
                Scanner input = new Scanner(System.in);
                num = input.nextInt();

                sum = sum + num;
            }
            avrg = sum / 5;
            System.out.println("The sum of 5 numbers is:" + sum + "\nThe average is:" + avrg);
        }

    }
}