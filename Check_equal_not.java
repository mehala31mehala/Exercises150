package Excersise250;
import java.util.Scanner;
public class Check_equal_not {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1=Obj.nextInt();
        int n2=Obj.nextInt();
        int n3=Obj.nextInt();
        if(n1==n2&&n1==n3) {
            System.out.println("The numbers are equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
