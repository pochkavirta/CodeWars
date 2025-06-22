package Kyu7.Path1;

//TODO Your task is to return the sum of Triangular Numbers up-to-and-including the nth Triangular Number.
// Triangular Number: "any of the series of numbers (1, 3, 6, 10, 15, etc.) obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc."

import java.util.stream.IntStream;

public class Task96 {
    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));
        System.out.println(sumTriangularNumbers(34));
        System.out.println(sumTriangularNumbers(-291));
        System.out.println(sumTriangularNumbers(943));
        System.out.println(sumTriangularNumbers(-971));
    }

    public static int sumTriangularNumbers(int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> i * (i + 1) / 2)
                .sum();
    }
}
