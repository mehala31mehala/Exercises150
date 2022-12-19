package Excersise250;
import java.util.Arrays;
public class Second_max {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,2,7,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index=arr.length-1;
        while(arr[index]==arr[arr.length-1]){
            index--;
        }
        System.out.println("second largest value is:"+arr[index]);
    }
}
