package Excersise250;
import java.util.Arrays;
public class Common_element {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7,8};
        int[] array2={1,4,10,3,50,9,7,8,12,23};
        System.out.println("first array:"+Arrays.toString(array1));
        System.out.println("second array:"+Arrays.toString(array2));
        for(int i=0;i<array1.length;i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Common element:"+array1[i]);
                }
                }
                }
                }
                }



