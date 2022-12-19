package Excersise250;

public class Average_marks {
    public static void main(String[] args) {
        int[] arr={80,70,60,50,40};
        int avrg=0;
        for(int i=0;i<arr.length;i++ ) {
            avrg = avrg + arr[i];
        }
            System.out.println("Average of marks is:"+avrg/arr.length);
        }
    }

