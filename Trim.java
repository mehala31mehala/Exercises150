package Excersise250;
import java.util.Scanner;
public class Trim {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String word=in.nextLine();
        System.out.println("new string:\n"+word.trim());
    }
}
