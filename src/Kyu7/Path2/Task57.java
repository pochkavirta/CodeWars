package Kyu7.Path2;

//TODO Given a Divisor and a Bound , Find the largest integer N , Such That ,
// N is divisible by divisor
// N is less than or equal to bound
// N is greater than 0.

public class Task57 {
    public static void main(String[] args) {
        System.out.println(maxMultiple(2, 7));
        System.out.println(maxMultiple(3, 10));
        System.out.println(maxMultiple(7, 17));
        System.out.println(maxMultiple(10, 50));
        System.out.println(maxMultiple(37, 200));
        System.out.println(maxMultiple(7, 100));
    }

    public static int maxMultiple(int divisor, int bound) {
        while (bound > 0) {
            if (bound % divisor == 0) {
                break;
            }
            bound--;
        }
        return bound;
    }
}
