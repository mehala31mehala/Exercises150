package Excersise250;
import java.util.Arrays;
public class swaparray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println("Original array:"+Arrays.toString(arr));
        int x=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=x;
        System.out.println("Swap:"+Arrays.toString(arr));
    }
}
