package Kyu7.Path2;

//TODO Given a sequence of numbers, find the largest pair sum in the sequence.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task85 {
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));
        System.out.println(largestPairSum(new int[]{99, 2, 2, 23, 19}));
    }

    public static int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }

    public static int largestPairSum1(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int largestPairSum2(int[] numbers) {
        Integer firstMax = Arrays.stream(numbers).max().orElse(0);
        List<Integer> numbersList = new ArrayList<>(Arrays.stream(numbers).boxed().toList());
        numbersList.remove(firstMax);
        return numbersList.stream().max(Integer::compare).get() + firstMax;
    }
}
