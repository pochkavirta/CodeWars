package Kyu7.Path1;

//TODO Your task is to write a function which returns the n-th term of the following series,
// which is the sum of the first n terms of the sequence (n is the input parameter).

import java.util.stream.IntStream;

public class Task33 {
    public static void main(String[] args) {
        System.out.println(seriesSum(0));
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(9));
        System.out.println(seriesSum(15));
        System.out.println(seriesSum(39));
        System.out.println(seriesSum(58));
    }

    public static String seriesSum(int n) {
        if (n == 0) return "0.00";
        if (n == 1) return "1.00";
        Double result = 1 + IntStream.range(0, n - 1)
                .mapToDouble(x -> x)
                .map(i -> 1 / (4 + (i * 3)))
                .sum();
        return String.format("%.2f", result);
    }
}
