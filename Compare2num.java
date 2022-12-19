package Excersise250;
import java.util.Scanner;
public class Compare2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
            if (n1 == n2) {
                System.out.printf("%d == %d\n", n1, n2);
            if (n1 != n2) {
                System.out.printf("%d != %d\n", n1, n2);
            }
            if (n1 < n2) {
                System.out.printf("%d < %d\n", n1, n2);
            }
            if (n1 > n2) {
                System.out.printf("%d > %d\n", n1, n2);
            }
            if (n1 <= n2) {
                System.out.printf("%d <= %d\n", n1, n2);
            }
            if (n1 >= n2) {
                System.out.printf("%d >= %d\n", n1, n2);
            }
        }
    }
}
