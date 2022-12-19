package Excersise250;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner Score=new Scanner(System.in);
        System.out.println("enter the quiz score");
        float quiz=Score.nextFloat();
        System.out.println("enter the mid_term score:");
        float mid=Score.nextFloat();
        System.out.println("enter the final score:");
        float Final=Score.nextFloat();
        float avg=(quiz+mid+Final)/3;

        if(avg==90) {
            System.out.println("Student Grade: A");
        }else if(avg>=70&&avg<=90) {
            System.out.println("Student Grade: B");
        }else if(avg<=50&&avg>=70){
            System.out.println("Student Grade: C");
        }else if(avg<50) {
            System.out.println("Student Grade: F");
        }else {
            System.out.println("Invalid");
        }
    }
}
