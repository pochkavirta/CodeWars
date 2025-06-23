package Kyu8.Path1;

//TODO Create a function that takes 2 integers in form of a string as an input, and outputs the sum (also as a string):

import java.util.stream.Stream;

public class Task92 {
    public static void main(String[] args) {
        System.out.println(sumStr("4", "5"));
        System.out.println(sumStr("34", "5"));
        System.out.println(sumStr("", ""));
        System.out.println(sumStr("2", ""));
        System.out.println(sumStr("-5", "3"));
    }

    public static String sumStr(String a, String b) {
        return String.valueOf(Stream.of(a, b)
                .filter(i -> !i.isEmpty())
                .mapToInt(Integer::valueOf)
                .sum());
    }
}
