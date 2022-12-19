package Excersise250;
import java.util.Scanner;
public class Check_vowels {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the character:");
        char ch=Obj.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("it is a vowel");
        }else if(ch>='a'&&ch<='z'||ch=='A'&&ch=='Z'){
            System.out.println("it is constant");
        }else{
            System.out.println("not a alphabet");
        }
    }
}
