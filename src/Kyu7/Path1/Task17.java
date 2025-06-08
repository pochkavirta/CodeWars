package Kyu7.Path1;

//TODO Given two integers a and b, which can be positive or negative, find the sum of all
// the integers between and including them and return it. If the two numbers are equal return a or b.

import java.util.stream.IntStream;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(GetSum(1, 0));
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(1, 1));
        System.out.println(GetSum(-1, 0));
        System.out.println(GetSum(-1, 2));
    }

    public static int GetSum(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .sum();
    }
}
