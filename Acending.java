package Excersise250;
import java.util.Arrays;
import java.util.Scanner;
public class Acending {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = Obj.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Accending order:"+Arrays.toString(arr));

        }
    }

