package Kyu7.Path1;

//TODO Your task is to write function factorial.

public class Task62 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(7));
    }

    public static long factorial(int n) {
        long result = 1;
        while (n > 0) {
            result *= n;
            n -= 1;
        }
        return result;
    }
}
