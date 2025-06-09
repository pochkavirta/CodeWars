package Kyu7.Path2;

//TODO Write a function which takes a number as input and returns the sum of the absolute value of each of the number's decimal digits.

import java.util.Arrays;

public class Task51 {
    public static void main(String[] args) {
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(99));
        System.out.println(sumDigits(-32));
    }

    public static int sumDigits(int number) {
        return Arrays.stream(Integer.toString(number)
                        .replace("-", "")
                        .split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
