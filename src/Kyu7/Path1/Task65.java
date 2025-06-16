package Kyu7.Path1;

//TODO Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as
// dots. i.e. You need to return the nth triangular number. You should return 0 for out of range values:

public class Task65 {
    public static void main(String[] args) {
        System.out.println(triangular(0));
        System.out.println(triangular(2));
        System.out.println(triangular(3));
        System.out.println(triangular(-10));
        System.out.println(triangular(4));
        System.out.println(triangular(1275));
        System.out.println(triangular(-1));
    }

    public static int triangular(int n) {
        return (n <= 0) ? 0 : n * (n + 1) / 2;
    }

    public static long triangular(long n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
