package Kyu8.Path1;

//TODO Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task93 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
    }

    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b)
                .toArray();
    }
}
