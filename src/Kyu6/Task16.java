package Kyu6;

//TODO A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised
// to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1652));
        System.out.println(isNarcissistic(1634));
        System.out.println(isNarcissistic(112));
    }

    public static boolean isNarcissistic(int number) {
        String numberString = String.valueOf(number);
        return Arrays.stream(numberString.split(""))
                .mapToDouble(i -> Math.pow(Double.parseDouble(i), numberString.length()))
                .sum() == number;
    }
}
