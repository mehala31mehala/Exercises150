package Excersise250;
import java.util.Scanner;
public class Mul_table {
    public static void main(String[] args) {
        int i,n;
        {
         System.out.println("enter the term:");
         Scanner Obj=new Scanner(System.in);
         n=Obj.nextInt();
         for(i=1;i<=16;i++){
             System.out.println(n+"X"+i+"="+n*i);
         }
        }
    }
}
