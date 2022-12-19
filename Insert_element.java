package Excersise250;
import java.util.Arrays;
public class Insert_element {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original array:" +Arrays.toString (array));
        for (int i : array) {
            array[5] = 10;
        }
        System.out.println("New array:" +Arrays.toString(array));

        }
    }

