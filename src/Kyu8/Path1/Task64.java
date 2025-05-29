package Kyu8.Path1;

//TODO Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

import java.util.Arrays;
import java.util.List;

public class Task64 {
    public static void main(String[] args) {
        System.out.println(sum((Arrays.asList(5, "5"))));
        System.out.println(sum((Arrays.asList(9, 3, "7", "3"))));
        System.out.println(sum((Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7))));
        System.out.println(sum((Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"))));
        System.out.println(sum((Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3"))));
        System.out.println(sum((Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"))));
        System.out.println(sum((Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7))));
    }

    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(num -> Integer.parseInt(num.toString())).sum();
    }
}
