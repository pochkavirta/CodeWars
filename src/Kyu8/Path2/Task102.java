package Kyu8.Path2;

//TODO Given a number n, return the number of positive odd numbers below n, EASY!

public class Task102 {
    public static void main(String[] args) {
        System.out.println(oddCount(0));
        System.out.println(oddCount(7));
        System.out.println(oddCount(15));
        System.out.println(oddCount(1744));
        System.out.println(oddCount(15023));
    }

    public static int oddCount(int n) {
        return n / 2;
    }
}