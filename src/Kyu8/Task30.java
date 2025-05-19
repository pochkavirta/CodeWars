package Kyu8;

/*TODO Write a function that takes an array of numbers and returns the sum of the numbers.
   The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.*/

import java.util.Arrays;

public class Task30 {
    public static void main(String[] args) {
        System.out.println(sum((new double[]{1, 2, 3})));
        System.out.println(sum((new double[]{1.1, 2.2, 3.3})));
        System.out.println(sum((new double[]{1, 5.2, 4, 0, -1})));
        System.out.println(sum((new double[]{30, 89, 100, 101})));
    }

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
