package Kyu7.Path1;

//TODO Complete the method which accepts an array of integers, and returns one of the following:
// "yes, ascending" - if the numbers in the array are sorted in an ascending order
// "yes, descending" - if the numbers in the array are sorted in a descending order
// "no" - otherwise
// The order does not have to be strict: a sorted array can contain consecutive duplicates, e.g. [1, 1, 2, 3] is sorted in ascending order.
// It is guaranteed that there will always be a unique valid answer. More precisely:
// there will be no arrays with less than 2 elements
// there will be no arrays where all elements are equal

import java.util.Arrays;
import java.util.Comparator;

public class Task74 {
    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{1, 3, 9, 4}));
        System.out.println(isSortedAndHow(new int[]{1, 2}));
        System.out.println(isSortedAndHow(new int[]{2, 1}));
    }

    public static String isSortedAndHow(int[] array) {
        int[] sorted = Arrays.stream(array)
                .sorted()
                .toArray();
        int[] sortedReverse = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return Arrays.equals(array, sorted) ? "yes, ascending"
                : Arrays.equals(array, sortedReverse) ? "yes, descending"
                : "no";
    }
}

