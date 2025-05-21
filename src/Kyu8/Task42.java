package Kyu8;

//TODO Given a non-empty array of integers, return the result of multiplying the values together in order.

import java.util.Arrays;

public class Task42 {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3}));
        System.out.println(grow(new int[]{4, 1, 1, 1, 4}));
        System.out.println(grow(new int[]{2, 2, 2, 2, 2, 2}));
    }

    public static int grow(int[] x) {
        return Arrays.stream(x)
                .reduce(1, (a, b) -> a * b);
    }
}