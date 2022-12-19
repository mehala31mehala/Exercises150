package Excersise250;
import java.util.Arrays;
public class Num_even_odd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Given array:" + Arrays.toString(array));
        int even =0, odd =0 ,sum=0,sumo=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
                sum=sum+array[i];
            }
        }

            for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 != 0) {
                sumo=sumo+array[j];
                  odd++;
                }
            }
            System.out.println("number of even numbers:"+even);
            System.out.println("number of odd numbers:"+odd);
        System.out.println("sum of even:"+sum);
        System.out.println("sum of odd:"+sumo);
        }
    }

