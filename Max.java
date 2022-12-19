package Excersise250;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("The greatest num is"+" "+n1);
        }
        if(n2>n1&&n2>n3){
            System.out.println("The greatest num is"+" "+n2);
        }
        if(n3>n1&&n3>n1){
            System.out.println("The greatest num is"+" "+n3);
        }
    }
}

