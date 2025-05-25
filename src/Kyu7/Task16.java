package Kyu7;

/*TODO Create a function that returns the sum of the two lowest positive numbers given an
   array of minimum 4 positive integers. No floats or non-positive integers will be passed.
   For Java, those integers will come as double precision (long). */

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNumbers(new long[]{5, 8, 12, 19, 22}));
        System.out.println(sumTwoSmallestNumbers(new long[]{15, 28, 4, 2, 43}));
        System.out.println(sumTwoSmallestNumbers(new long[]{3, 87, 3, 12, 7}));
        System.out.println(sumTwoSmallestNumbers(new long[]{23, 71, 33, 82, 1}));
        System.out.println(sumTwoSmallestNumbers(new long[]{52, 76, 14, 12, 4}));
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        return Arrays.stream(numbers)
                .sorted()
                .limit(2)
                .sum();
    }
}

