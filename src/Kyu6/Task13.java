package Kyu6;

//TODO Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
// which is the number of times you must multiply the digits in num until you reach a single digit.

import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        int count = 0;
        while (n > 9) {
            List<String> numbers = List.of(String.valueOf(n).split(""));
            n = numbers.stream()
                    .mapToLong(Integer::parseInt)
                    .reduce(1, (a, b) -> a * b);
            count++;
        }
        return count;
    }
}
