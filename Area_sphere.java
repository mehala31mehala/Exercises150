package Excersise250;
import java.util.Scanner;
public class Area_sphere {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the radius:");
        int rad=Obj.nextInt();
        double area=(4*22*Math.pow(rad,3)/21);
        System.out.println(area);
    }
}
