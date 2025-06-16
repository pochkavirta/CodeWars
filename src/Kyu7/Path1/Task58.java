package Kyu7.Path1;

//TODO Determine the total number of digits in the integer (n>=0) given as input to the function. For example, 9 is a
// single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.

public class Task58 {
    public static void main(String[] args) {
        System.out.println(Digits(5L));
        System.out.println(Digits(12345L));
        System.out.println(Digits(9876543210L));
    }

    public static int Digits(long n) {
        return String.valueOf(n).length();
    }
}