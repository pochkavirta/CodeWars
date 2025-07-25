package Kyu7.Path1;

//TODO Given a 2D ( nested ) list ( array, vector, .. ) of size m * n, your task is to find the sum of the minimum values in each row.

import java.util.Arrays;

public class Task66 {
    public static void main(String[] args) {
        System.out.println(sumOfMinimums(new int[][]{{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {20, 21, 34, 56, 100}}));
        System.out.println(sumOfMinimums(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}));
        System.out.println(sumOfMinimums(new int[][]{{11, 12, 14, 54}, {67, 89, 90, 56}, {7, 9, 4, 3}, {9, 8, 6, 7}}));
    }

    public static int sumOfMinimums(int[][] arr) {
        return Arrays.stream(arr)
                .mapToInt(i -> Arrays.stream(i)
                        .min()
                        .orElse(0))
                .sum();
    }
}
