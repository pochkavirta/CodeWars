package Kyu7;

//TODO Count the number of divisors of a positive integer n.
// Random tests go up to n = 500000, but fixed tests go higher.

import java.util.stream.IntStream;

public class Task39 {
    public static void main(String[] args) {
        Task39 task39 = new Task39();
        System.out.println(task39.numberOfDivisors(1));
        System.out.println(task39.numberOfDivisors(4));
        System.out.println(task39.numberOfDivisors(5));
        System.out.println(task39.numberOfDivisors(12));
        System.out.println(task39.numberOfDivisors(30));
    }

    public long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}
