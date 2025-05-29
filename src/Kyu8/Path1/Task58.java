package Kyu8.Path1;

//TODO I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.

import java.util.Arrays;

public class Task58 {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        System.out.println(arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
