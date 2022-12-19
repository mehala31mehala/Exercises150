package Excersise250;
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius:");
        double r=input.nextDouble();
        double area=22*(r*r)/7;
        System.out.println("the area of the circle is:"+area);
    }
}
