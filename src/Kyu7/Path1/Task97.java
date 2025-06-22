package Kyu7.Path1;

//TODO Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task97 {
    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5, 4, 2, 3}));
        System.out.println(minSum(new int[]{12, 6, 10, 26, 3, 24}));
        System.out.println(minSum(new int[]{9, 2, 8, 7, 5, 4, 0, 6}));
    }

    public static int minSum(int[] passed) {
        final int[] array = passed.clone();
        Arrays.sort(array);
        return IntStream.range(0, array.length / 2)
                .map(i -> array[i] * array[array.length - i - 1])
                .sum();
    }

    public static int minSum1(int[] passed) {
        int result = 0;
        List<Integer> list = Arrays.stream(passed)
                .sorted()
                .boxed()
                .toList();
        for (int i = 0; i < list.size() / 2; i++) {
            result += list.get(i) * list.get(list.size() - 1 - i);
        }
        return result;
    }
}
