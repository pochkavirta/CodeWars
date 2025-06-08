package Kyu7.Path1;

//TODO Given a list of integers, determine whether the sum of its elements is odd or even.
// Give your answer as a string matching "odd" or "even".
// If the input array is empty consider it as: [0] (array with a zero).

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{0}));
        System.out.println(oddOrEven(new int[]{0, 1, 4}));
        System.out.println(oddOrEven(new int[]{0, -1, -5}));
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }

    public static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
