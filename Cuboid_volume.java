package Excersise250;
import java.util.Scanner;
public class Cuboid_volume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values");
        int l=input.nextInt();
        int b=input.nextInt();
        int h=input.nextInt();
        double volume =l*b*h;
        System.out.println(volume);

    }
}
