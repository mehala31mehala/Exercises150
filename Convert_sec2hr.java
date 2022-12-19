package Excersise250;
import java.util.Scanner;
public class Convert_sec2hr {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the seconds:");
        int sec = Input.nextInt();
        int seconds = sec % 60;
        int hour = sec / 60;
        int min = hour % 60;
        hour = hour / 60;
        System.out.println(hour + ":"+min+":"+seconds);
    }
}
