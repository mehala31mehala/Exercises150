package Excersise250;
import java.util.Scanner;
public class cube_of_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("The cube of"+i+" "+"is:"+(i*i*i));
        }
    }
}
