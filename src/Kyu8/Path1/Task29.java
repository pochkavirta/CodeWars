package Kyu8.Path1;

//TODO Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.

public class Task29 {
    public static void main(String[] args) {
        System.out.println(isDivisible(3, 1, 3));
        System.out.println(isDivisible(12, 2, 6));
        System.out.println(isDivisible(100, 5, 3));
        System.out.println(isDivisible(12, 7, 5));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
