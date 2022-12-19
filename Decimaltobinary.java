package Excersise250;
import java.util.Scanner;
public class Decimaltobinary {
    public static void main(String[]args){
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int num=Obj.nextInt();
        System.out.println("The Binary number of the given decimal is:"+Integer.toBinaryString(num));
    }
}
