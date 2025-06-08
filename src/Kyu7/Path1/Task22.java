package Kyu7.Path1;

//TODO You might know some pretty large perfect squares. But what about the NEXT one?
// Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
// Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
// If the argument is itself not a perfect square then return either -1 or an empty value like None or null, depending
// on your language. You may assume the argument is non-negative.

public class Task22 {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }

    public static long findNextSquare(long sq) {
        double d = Math.sqrt(sq);
        return (int) d != d ? -1 : (long) Math.pow(d + 1, 2);
    }
}
