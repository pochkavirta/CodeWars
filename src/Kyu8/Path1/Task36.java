package Kyu8.Path1;

//TODO Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{1, -2, 3, -4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{-1, -2, -3, -4, -5})));
        System.out.println(Arrays.toString(invert(new int[]{})));
        System.out.println(Arrays.toString(invert(new int[]{0})));
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}
