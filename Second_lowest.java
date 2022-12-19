package Excersise250;
import java.util.Arrays;
public class Second_lowest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                secondmin=min;
            }else if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }else if(arr[i]<secondmin){
                secondmin=arr[i];
            }
        }
        System.out.println(secondmin);
    }
}
