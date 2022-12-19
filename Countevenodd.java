package Excersise250;
import java.util.Arrays;
public class Countevenodd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array:"+Arrays.toString(arr));
        int count_even=0;
        int count_odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count_even++;
            }else{
                count_odd++;
            }
        }
        System.out.println("count of even numbers:"+count_even);
        System.out.println("count of odd numbers:"+count_odd);
    }
}
