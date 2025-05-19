package Kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(map(new int[]{4, 1, 1, 1, 4})));
        System.out.println(Arrays.toString(map(new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }
}
