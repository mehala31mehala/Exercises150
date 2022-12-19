package Excersise250;
import java.util.Scanner;
public class Area_Rhombus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the diagonals value:");
        double d1=input.nextDouble();
        double d2=input.nextDouble();
        double area=(d1*d2)/2;
        System.out.println(area);
    }
}
