package Kyu8;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
        System.out.println(squareSum(new int[]{1, 2}));
        System.out.println(squareSum(new int[]{5, -3, 4}));
        System.out.println(squareSum(new int[]{}));
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n) //редус
                .reduce(0, (x, y) -> x + y * y);
    }

    public static int squareSum2(int[] n) {
        return Arrays.stream(n) //маппинг
                .map(x -> x * x)
                .sum();
    }
}