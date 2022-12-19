package Excersise250;
import java.util.Scanner;
public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the length and base of the rectangle:");
        int l=Obj.nextInt();
        int b=Obj.nextInt();
        double area=l*b;
        System.out.println();
    }
}
