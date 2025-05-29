package Kyu8.Path1;

/*TODO Given an array of integers.
   Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
   If the input is an empty array or is null, return an empty array.*/

import java.util.Arrays;

public class Task37 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        return input == null || input.length == 0 ? new int[0] : new int[]{(int)
                Arrays.stream(input).filter(i -> i > 0).count(),
                Arrays.stream(input).filter(i -> i < 0).sum()};
    }
}
