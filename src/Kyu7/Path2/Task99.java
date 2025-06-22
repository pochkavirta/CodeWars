package Kyu7.Path2;

//TODO Given an array/list [] of n integers , find maximum triplet sum in the array Without duplications .

import java.util.Arrays;
import java.util.Comparator;

public class Task99 {
    public static void main(String[] args) {
        System.out.println(maxTriSum(new int[]{3, 2, 6, 8, 2, 3}));
        System.out.println(maxTriSum(new int[]{2, 9, 13, 10, 5, 2, 9, 5}));
        System.out.println(maxTriSum(new int[]{2, 1, 8, 0, 6, 4, 8, 6, 2, 4}));
        System.out.println(maxTriSum(new int[]{-3, -27, -4, -2, -27, -2}));
        System.out.println(maxTriSum(new int[]{-14, -12, -7, -42, -809, -14, -12}));
        System.out.println(maxTriSum(new int[]{-13, -50, 57, 13, 67, -13, 57, 108, 67}));
        System.out.println(maxTriSum(new int[]{-7, 12, -7, 29, -5, 0, -7, 0, 0, 29}));
    }

    public static int maxTriSum(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

