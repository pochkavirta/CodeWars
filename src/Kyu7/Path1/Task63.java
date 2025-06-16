package Kyu7.Path1;

//TODO Given a list of digits, return the smallest number that could be formed from these digits, using the digits only
// once (ignore duplicates). Only positive integers in the range of 1 to 9 will be passed to the function.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task63 {
    public static void main(String[] args) {
        System.out.println(minValue(new int[]{1, 3, 1}));
        System.out.println(minValue(new int[]{5, 7, 5, 9, 7}));
        System.out.println(minValue(new int[]{1, 9, 3, 1, 7, 4, 6, 6, 7}));
        System.out.println(minValue(new int[]{4, 7, 5, 7}));
        System.out.println(minValue(new int[]{4, 8, 1, 4}));
        System.out.println(minValue(new int[]{5, 7, 9, 5, 7}));
        System.out.println(minValue(new int[]{6, 7, 8, 7, 6, 6}));
    }

    public static int minValue(int[] values) {
        String result = Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(result);
    }
}
