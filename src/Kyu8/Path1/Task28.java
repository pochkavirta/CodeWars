package Kyu8.Path1;

/*TODO In this kata, we will make a function to test whether a period is late.
   Our function will take three parameters:
   last - The Date object with the date of the last period
   today - The Date object with the date of the check
   cycleLength - Integer representing the length of the cycle in days
   Return true if the number of days passed from last to today is greater than cycleLength. Otherwise, return false.*/

import java.time.LocalDate;

public class Task28 {
    public static void main(String[] args) {
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28));
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return last.plusDays(cycleLength).isBefore(today);
    }
}
