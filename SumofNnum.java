package Excersise250;
import java.util.Scanner;
public class SumofNnum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers you want:");
        int n=input.nextInt();
        int sum=0;
        int[] arr=new int[n];
        System.out.println("enter the "+n+" numbers");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the "+(i+1)+ "number:");
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("enter the "+n+"number="+sum);
    }
}
