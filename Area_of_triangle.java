package Excersise250;
import java.util.Scanner;
public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the base and height of the triangle:");
        int b=Obj.nextInt();
        int h=Obj.nextInt();
        double area=(b*h)/2;
        System.out.println("Area of the triangle is:"+area);
    }
}
