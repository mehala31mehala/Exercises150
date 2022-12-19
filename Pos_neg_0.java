package Excersise250;
import java.util.Scanner;
public class Pos_neg_0 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=obj.nextInt();
        if(num>0) {
            System.out.println("positive");
        }
        else if(num<0) {
            System.out.println("negative");
        }else{
            System.out.println("Zero");
        }

    }
}
