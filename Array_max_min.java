package Excersise250;

public class Array_max_min {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[j]<min){
               min=arr[j];
            }
        }
        }
        System.out.println("Maximum value is :"+ max);
        System.out.println("Minimum is :"+min);
    }
}
