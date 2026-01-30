package Kyu8.Path2;

//TODO Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

import java.util.Arrays;
import java.util.stream.LongStream;

public class Task101 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(0)));
        System.out.println(Arrays.toString(powersOfTwo(1)));
        System.out.println(Arrays.toString(powersOfTwo(4)));
    }

    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n)
                .map(i -> (long) Math.pow(2, i))
                .toArray();
    }
}
