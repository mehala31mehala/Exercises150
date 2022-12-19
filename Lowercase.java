package Excersise250;
import java.util.Scanner;
public class Lowercase {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=Obj.nextLine();
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
    }
}
