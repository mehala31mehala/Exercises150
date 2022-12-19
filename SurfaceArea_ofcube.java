package Excersise250;
import java.util.Scanner;
public class SurfaceArea_ofcube {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the side of the cube:");
        int side=Obj.nextInt();
        double r=(4*Math.pow(side,2));
        System.out.println(r);
    }
}
