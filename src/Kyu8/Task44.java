package Kyu8;

//TODO Build a function that returns an array of integers from n to 1 where n>0.

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task44 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        return IntStream.range(1, n + 1)
                .boxed() //упаковка в Integer
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
