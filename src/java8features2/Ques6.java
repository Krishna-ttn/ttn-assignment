package java8features2;
//Ques6:
//Using java 8 date/time api:
//1. WAP to get two dates from user and print if the first date occurs before or after the second date supplied by the user.
//2. WAP to print current date and time in 3 different time zones.

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the first date in format yyyy-mm-dd");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.println(" Input the Second date in format yyyy-mm-dd");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        if(date1.isBefore(date2)){
            System.out.println("date 1 is before date2");
        }else if(date1.isAfter(date2)){
            System.out.println("date 1 is after date2 ");
        }else {
            System.out.println("date1 is equal to date2");
        }

        ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime NewYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime LondonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("Time in India" + IndiaTime);
        System.out.println("Time in NewYork" + NewYorkTime);
        System.out.println("Time in London" + LondonTime);

    }
}
