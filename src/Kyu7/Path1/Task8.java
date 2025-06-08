package Kyu7.Path1;

/*TODO Given an integral number, determine if it's a square number:
   In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
   The tests will always use some integral number, so don't worry about that in dynamic typed languages. */

public class Task8 {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
        System.out.println(isSquare(153931456));
    }

    public static boolean isSquare(int n) {
        return (int) Math.sqrt(n) * Math.sqrt(n) == n;
    }
}
