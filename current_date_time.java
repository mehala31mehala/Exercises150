package Excersise250;
import java.util.Calendar;
public class current_date_time {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.printf("%tB%te,%tY%n",cal,cal,cal);
        System.out.printf("%tl:%tM %tp%n",cal,cal,cal);
    }
}
