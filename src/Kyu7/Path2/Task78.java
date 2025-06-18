package Kyu7.Path2;

//TODO Given an array of numbers, return a new array of length number containing the last even numbers from the original
// array (in the same order). The original array will be not empty and will contain at least "number" even numbers.

import java.util.Arrays;

public class Task78 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
        System.out.println(Arrays.toString(evenNumbers(new int[]{-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26}, 2)));
        System.out.println(Arrays.toString(evenNumbers(new int[]{6, -25, 3, 7, 5, 5, 7, -3, 23}, 1)));
    }

    public static int[] evenNumbers(int[] arr, int n) {
        int[] evenNumbers = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .toArray();
        return Arrays.stream(evenNumbers)
                .skip(evenNumbers.length - n)
                .toArray();
    }
}

