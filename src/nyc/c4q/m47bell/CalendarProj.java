package nyc.c4q.m47bell;

import java.util.Calendar;
import java.util.Scanner;


/**
 * Created by c4q-marbella on 3/19/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class CalendarProj {

    int month;
    int date;
    int year;

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        Calendar calender =Calendar.getInstance();
        //int currYear = calender.getInstance().get(Calendar.YEAR);
       // int currDate = calender.getInstance().get(Calendar.DAY_OF_MONTH);
       // int currMonth = calender.getInstance().get(Calendar.MONTH);
        int currDoY = calender.getInstance().get(Calendar.DAY_OF_YEAR);
        int bDay = kb.nextInt(Calendar.DAY_OF_YEAR);
        calender.set(2015, 3, 19);

        System.out.println("Please enter your birth-date: ");

        System.out.println("What is the month (1-12): ");

        int date =kb.nextInt();

        System.out.println("What is the day (1-31): ");

        int numOfDays= currDoY - bDay;

        System.out.println("There are "+ numOfDays + " days until your birthday!");














    }

    public CalendarProj(int newMonth){
        this.year= year;
        this.month=month;
        this.date=date;

    }
    public int getMonth(){

        return this.month;

    }

    public void set(int newYear,int newMonthNum, int newDate){

        this.year = newYear;
        this.month = newMonthNum;
        this.date = newDate;

    }
    public int getDay(){

        return this.date;

    }

    public static void get(){
        int year= 2015;

        System.out.println(year);
    }













}
