package Kyu7.Path2;

//TODO In this Kata, your function receives an array of integers as input. Your task is to determine whether the
// numbers are in ascending order. An array is said to be in ascending order if there are no two adjacent integers
// where the left integer exceeds the right integer in value.
// For the purposes of this Kata, you may assume that all inputs are valid, i.e. arrays containing only integers.
// Note that an array of 0 or 1 integer(s) is automatically considered to be sorted in ascending order since all (zero)
// adjacent pairs of integers satisfy the condition that the left integer does not exceed the right integer in value.

import java.util.Arrays;

public class Task59 {
    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1, 2}));
        System.out.println(isAscOrder(new int[]{2, 1}));
        System.out.println(isAscOrder(new int[]{1, 2, 3}));
        System.out.println(isAscOrder(new int[]{1, 3, 2}));
        System.out.println(isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058}));
        System.out.println(isAscOrder(new int[]{56, 98, 123, 67, 742, 1024, 32, 90969}));
        System.out.println(isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058}));
        System.out.println(isAscOrder(new int[]{56, 98, 123, 67, 742, 1024, 32, 90969}));
    }

    public static boolean isAscOrder(int[] arr) {
        return Arrays.equals(Arrays.stream(arr).sorted().toArray(), arr);
    }
}
