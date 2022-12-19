package Excersise250;
import java.util.Arrays;
public class Reverse_array {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        System.out.println("Original array:"+Arrays.toString(arr));
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Reversed array:"+Arrays.toString(arr));
    }
}
