package Excersise250;
import java.util.Scanner;
public class Countall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = input.nextLine();
        count(text);
    }
    public static void  count(String text){
        char[] ch=text.toCharArray();
        int letter=0;
        int space=0;
        int num=0;
        int other=0;
        for(int i=0;i<text.length();i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("The string is");
        System.out.println("letter:"+letter);
        System.out.println("space:"+space);
        System.out.println("num:"+num);
        System.out.println("other char:"+other);
    }

}
