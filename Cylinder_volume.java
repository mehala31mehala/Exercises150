package Excersise250;
import java.util.Scanner;
public class Cylinder_volume {
    public static void main(String[] args) {
    Scanner Obj=new Scanner(System.in);
        System.out.println("enter the  radius and height:");
        int r=Obj.nextInt();
        int h=Obj.nextInt();
        double volume =(22*r*r*h)/7;
        double vol=(22*r*r*h)/(3*7);
        System.out.println("The volume of the cylinder:" +volume);
        System.out.println("volume of the cone:"+vol);
    }
}
