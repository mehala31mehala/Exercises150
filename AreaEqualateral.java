package Excersise250;
import java.util.Scanner;
public class AreaEqualateral {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the side:");
        int a=Obj.nextInt();
        double area=(Math.sqrt(3)/4)*(a*a);
        System.out.println(area);
        }

    }

