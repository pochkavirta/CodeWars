package Kyu8;

import java.util.stream.IntStream;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(8));
        System.out.println(summation(66));
    }

    public static int summation(int n) {
        return n * (n + 1) / 2; //математика
    }

    public static int summation2(int n) {
        return IntStream.rangeClosed(1, n) //стрим
                .sum();
    }
}