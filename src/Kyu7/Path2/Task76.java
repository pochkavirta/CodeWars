package Kyu7.Path2;

//TODO Write a function that takes a positive integer n, sums all the cubed values from 1 to n (inclusive), and returns that sum.
// Assume that the input n will always be a positive integer.

import java.util.stream.LongStream;

public class Task76 {
    public static void main(String[] args) {
        System.out.println(sumCubes(2));
        System.out.println(sumCubes(3));
        System.out.println(sumCubes(123));
    }

    public static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n)
                .map(i -> (long) Math.pow(i, 3))
                .sum();
    }
}

