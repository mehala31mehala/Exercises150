package Excersise250;

public class Primenum {
    public static void main(String[] args) {
        int sum=1;
        int count=0;
        int num=0;
        while (num<100) {
            num++;
            if (num % 2 != 0) {
                if (is_Prime(num)) {
                    sum = sum + num;
                    count++;
                }
                }
                }
            System.out.println(sum);
                }
        public static boolean is_Prime(int num){
        for(int i=3;i*i<=num;i=i+2){
            if(num%i==0){
                return false;
            }
            }
        return true;
        }
    }

