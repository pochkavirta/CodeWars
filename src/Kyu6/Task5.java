package Kyu6;

//TODO Implement a function that computes the difference between two lists. The function
// should remove all occurrences of elements from the first list (a) that are present in
// the second list (b). The order of elements in the first list should be preserved in the result.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a)
                .filter(x -> IntStream.of(b).noneMatch(y -> y == x))
                .toArray();
    }
}
