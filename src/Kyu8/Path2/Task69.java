package Kyu8.Path2;

//TODO You take your son to the forest to see the monkeys. You know that there are a certain number there (n),
// but your son is too young to just appreciate the full number, he has to start counting them from 1.
// As a good parent, you will sit and count with him. Given the number (n), populate an array with all
// numbers up to and including that number, but excluding zero.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task69 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
        System.out.println(Arrays.toString(monkeyCount(3)));
        System.out.println(Arrays.toString(monkeyCount(9)));
        System.out.println(Arrays.toString(monkeyCount(10)));
        System.out.println(Arrays.toString(monkeyCount(20)));
    }

    public static int[] monkeyCount(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }
}
