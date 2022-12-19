package Excersise250;

public class Specific_value {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(array,10));
        System.out.println(contains(array,56));
    }
    public static boolean contains(int[] array,int item){
        for(int i:array){
            if(item==i){
                return true;
            }
        }
        return false;
    }
}
