package Excersise250;
import java.util.Arrays;
public class duplicate_elements {
    public static void main(String[] args) {
        int[] array={0,0,1,2,2,3,3,4,5,6,6};
        for(int i=0;i<array.length-1;i++){
        for(int j=i+1;j<array.length;j++){
           if(array[i]==array[j]&&(i!=j)){
               System.out.println(array[j]);
           }
        }
        }

    }
}
