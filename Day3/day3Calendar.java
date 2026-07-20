package Day3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class day3Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for a date
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Create a date from the user input
        LocalDate inputDate = LocalDate.of(year, month, day);

        // Move the date forward by 30 days
        LocalDate after30Days = inputDate.plusDays(30);

        // Find the next Monday if the date is not already Monday
        LocalDate mondayDate = after30Days;
        while (mondayDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            mondayDate = mondayDate.plusDays(1);
        }

        // Print the results
        System.out.println("Input date: " + inputDate);
        System.out.println("Date after 30 days: " + after30Days);
        System.out.println("Next Monday: " + mondayDate);

        sc.close();
    }
}