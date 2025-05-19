package Kyu8;

import java.util.stream.IntStream;

//TODO Find the sum of all multiples of n below m

public class Task27 {
    public static void main(String[] args) {
        System.out.println(sumMul(2, 9));
        System.out.println(sumMul(5, 20));
        System.out.println(sumMul(4, 123));
        System.out.println(sumMul(123, 4567));
        System.out.println(sumMul(0, 0));
        System.out.println(sumMul(4, -7));
        System.out.println(sumMul(-3, 10));
    }

    public static long sumMul(int n, int m) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }
        return IntStream.range(n, m)
                .filter(i -> i % n == 0)
                .sum();
    }
}
