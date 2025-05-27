package Kyu8;

/*TODO Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
   The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
   Mind the input validation. */

import java.util.Arrays;

public class Task59 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{6, 2, 1, 8, 10}));
        System.out.println(sum(new int[]{1, 1, 11, 2, 3}));
        System.out.println(sum(new int[]{6, 6}));
        System.out.println(sum(new int[]{6}));
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        return Arrays.stream(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
    }

    public static int sum2(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);
        return Arrays.stream(numbers).sum() - (min + max);
    }
}
