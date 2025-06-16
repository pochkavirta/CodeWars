package Kyu7.Path1;

//TODO In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:
// -Years divisible by 4 are leap years,
// -but years divisible by 100 are not leap years,
// -but years divisible by 400 are leap years.
// Tested years are in range 1600 ≤ year ≤ 4000.

import static java.time.Year.of;

public class Task50 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2015));
        System.out.println(isLeapYear(2100));
    }

    public static boolean isLeapYear(int year) {
        return of(year).isLeap();
    }

    public static boolean isLeapYear1(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}