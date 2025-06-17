package Kyu7.Path2;

//TODO We want to generate a function that computes the series starting from 0 and ending until the given number.

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task75 {
    public static void main(String[] args) {
        System.out.println(showSequence(6));
        System.out.println(showSequence(-15));
        System.out.println(showSequence(0));
    }

    public static String showSequence(int value) {
        if (value < 0) {
            return String.format("%d<0", value);
        }
        if (value == 0) {
            return "0=0";
        }
        return IntStream.rangeClosed(0, value)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("+")) + " = " + IntStream.rangeClosed(0, value)
                .sum();
    }
}

