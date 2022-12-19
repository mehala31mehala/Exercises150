package Excersise250;
import java.util.Scanner;
public class Increase_Decrease {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1=Obj.nextInt();
        int n2 =Obj.nextInt();
        int n3=Obj.nextInt();
        if(n1<n2&&n2<n3) {
            System.out.println("Increasing");
        }else if(n1>n2&&n2>n3) {
            System.out.println("Decreasing");
        }else{
            System.out.println("Neither increasing nor decreasing");
        }
    }
}
