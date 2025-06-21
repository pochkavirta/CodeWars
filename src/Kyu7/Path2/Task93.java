package Kyu7.Path2;

//TODO Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.
// The inputs x and y are always greater or equal to 1, so the greatest common divisor will always be an integer that is also greater or equal to 1.

public class Task93 {
    public static void main(String[] args) {
        System.out.println(compute(10927782, 6902514));
        System.out.println(compute(18516, 790));
        System.out.println(compute(30, 12));
        System.out.println(compute(8, 9));
        System.out.println(compute(1, 1));
    }

    public static int compute(int x, int y) {
        return (x % y != 0) ? compute(y, x % y) : y; //Euclidean Algorithm
    }

    public static int compute1(int x, int y) {
        int divisor = Math.min(x, y);
        while (x % divisor != 0 || y % divisor != 0) {
            divisor--;
        }
        return divisor;
    }
}