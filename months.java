package Excersise250;
import java.util.Scanner;
public class months {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the month name:");
        String monthname="unknown";
        int month=Obj.nextInt();
        System.out.println("enter the year:");
        int year=Obj.nextInt();
        int numofDaysInMonth=0;
        switch (month){
            case 1:
            monthname="january";
            numofDaysInMonth=31;
            break;
            case 2:
            monthname="february";
            if(year%400==0&&(year%100!=0&&year  %4==0)){
                numofDaysInMonth=29;
            }else{
                numofDaysInMonth=28;
            }
            break;
            case 3:
            monthname="March";
            numofDaysInMonth=31;
            break;
            case 4:
            monthname="April";
            numofDaysInMonth=30;
            break;
            case 5:
            monthname="May";
            numofDaysInMonth=31;
            break;
            case 6:
            monthname="June";
            numofDaysInMonth=30;
            break;
            case 7:
            monthname="July";
            numofDaysInMonth=31;
            break;
            case 8:
                monthname="August";
                numofDaysInMonth=30;
                break;
            case 9:
            monthname="September";
            numofDaysInMonth=30;
            break;
            case 10:
            monthname="October" ;
            numofDaysInMonth=31;
            break;
            case 11:
             monthname="November";
             numofDaysInMonth=30;
             break;
            case 12:
             monthname="December";
             numofDaysInMonth=31;
             break;
        }
        System.out.println(year+":"+monthname+"="+numofDaysInMonth);
        }
    }