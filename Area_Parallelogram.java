package Excersise250;
import java.util.Scanner;
public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height and breadth:");
        int a=input.nextInt();
        int b=input.nextInt();
        //same formula for volume of the prism:
        double area =a*b;
        System.out.println(area);
    }
}
