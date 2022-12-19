package Excersise250;

public class Reverse {
    public static void main(String[] args) {
        String string = "techstudy";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);

    }
}
