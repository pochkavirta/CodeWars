package Kyu8;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(makeNegative(-5));
        System.out.println(makeNegative(7));
        System.out.println(makeNegative(0));
    }

    public static int makeNegative(final int x) {
        return (x > 0) ? -x : x; // Your code here.
    }
}