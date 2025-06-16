package Kyu7.Path1;

//TODO The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument
// and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age,  oldest age].
// The order of the numbers passed in could be any order. The array will always include at least 2 items.
// If there are two or more oldest age, then return both of them in array format.

import java.util.Arrays;
import java.util.Comparator;

public class Task54 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoOldestAges(new int[]{1, 2, 10, 8})));
        System.out.println(Arrays.toString(twoOldestAges(new int[]{1, 5, 87, 45, 8, 8})));
        System.out.println(Arrays.toString(twoOldestAges(new int[]{1, 3, 10, 0})));
    }

    static int[] twoOldestAges(int[] ages) {
        return Arrays.stream(ages)
                .sorted()
                .skip(ages.length - 2)
                .toArray();
    }

    public static int[] twoOldestAges1(int[] ages) {
        return Arrays.stream(ages)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .sorted()
                .mapToInt(i -> i)
                .toArray();
    }
}
