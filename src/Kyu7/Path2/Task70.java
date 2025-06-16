package Kyu7.Path2;

//TODO Complete the function power_of_two/powerOfTwo (or equivalent, depending on your language) that determines if a
// given non-negative integer is a power of two. From the corresponding Wikipedia entry:
// a power of two is a number of the form 2n where n is an integer, i.e. the result of exponentiation with number two
// as the base and integer n as the exponent.
// You may assume the input is always valid.

public class Task70 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1024));
        System.out.println(isPowerOfTwo(4096));
        System.out.println(isPowerOfTwo(333));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(long n) {
        return 1 == Long.bitCount(n);
    }

    public static boolean isPowerOfTwo1(long n) {
        double numberTwo = 2;
        for (double i = 0; Math.pow(numberTwo, i) <= n; i++) {
            if (Math.pow(numberTwo, i) == n) {
                return true;
            }
        }
        return false;
    }
}
