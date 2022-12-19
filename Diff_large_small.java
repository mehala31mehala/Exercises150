package Excersise250;
import java.util.Arrays;
public class Diff_large_small {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[j]<min){
                min=arr[j];
            }
        }
        }
        System.out.println("maximum:" +max);
        System.out.println("minimum:"+ min);
        System.out.println("Difference between largest and small: "+ (max-min));
    }
}
