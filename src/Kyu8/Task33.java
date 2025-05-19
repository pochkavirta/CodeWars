package Kyu8;

//TODO Write a function which calculates the average of the numbers in a given array.

import java.util.Arrays;

public class Task33 {
    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{100, 50, 25, 75, 0}));
        System.out.println(findAverage(new int[]{5, 5, 5, 5}));
        System.out.println(findAverage(new int[]{1, 2, 3}));
        System.out.println(findAverage(new int[]{6, 4, 5, 2, 7}));
    }

    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }
}
