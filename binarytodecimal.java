package Excersise250;
import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter the binary number:");
        long bin=Obj.nextLong();
        long decimal=0;
        long rem;
        long i=0;
       while(bin!=0){
           rem=bin%10;
           decimal= (long) (decimal+rem*Math.pow(2,i));
           bin=bin/10;
           i++;
            }
        System.out.println(decimal);
        }

    }
        //int num=0b10010;
        //System.out.println(num);


