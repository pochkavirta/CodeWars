package Kyu7.Path2;

//TODO In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive
// integers less than or equal to n. For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1.
// Write a function to calculate factorial for a given input. If input is below 0 or above 12 throw an exception of
// type ArgumentOutOfRangeException (C#) or IllegalArgumentException (Java) or RangeException (PHP) or throw a
// RangeError (JavaScript) or ValueError (Python) or return -1 (C).

public class Task49 {
    public static void main(String[] args) {
        System.out.println(new Task49().factorial(0));
        System.out.println(new Task49().factorial(3));
        System.out.println(new Task49().factorial(5));
        System.out.println(new Task49().factorial(-3));
        System.out.println(new Task49().factorial(13));
    }

    public int factorial(int n) {
        int result = 1;
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        while (n != 0) {
            result *= n;
            n--;
        }
        return result;
    }
}
