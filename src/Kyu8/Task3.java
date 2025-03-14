package Kyu8;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{}));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .filter(i -> i > 0)
                .sum();
    }
}