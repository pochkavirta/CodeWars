package Kyu7;

//TODO The museum of incredibly dull things wants to get rid of some exhibits. Miriam, the interior architect, comes up]
// with a plan to remove the most boring exhibits. She gives them a rating, and then removes the one with the lowest rating.
// However, just as she finished rating all exhibits, she's off to an important fair, so she asks you to write a program
// that tells her the ratings of the exhibits after removing the lowest one. Fair enough.
// Given an array of integers, remove the smallest value. Do not mutate the original array/list. If there are multiple
// elements with the same value, remove the one with the lowest index. If you get an empty array/list, return an empty array/list.
// Don't change the order of the elements that are left.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{})));
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 3, 2, 1, 4})));
        System.out.println(Arrays.toString(removeSmallest(new int[]{2, 2, 1, 2, 1})));
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 3, 2, 1, 4})));
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 4, 3, 2, 1})));
    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        List<Integer> list = new ArrayList<>(Arrays.stream(numbers).boxed().toList());
        int result = Arrays.stream(numbers).min().getAsInt();
        list.remove(result);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
