package Kyu7.Path2;

//TODO Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number
// from the text, can you return the number back to its original state?

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task87 {
    public static void main(String[] args) {
        System.out.println(filterString("123"));
        System.out.println(filterString("a1b2c3"));
        System.out.println(filterString("aa1bb2cc3dd"));
    }

    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[a-z]", ""));
    }

    public static long filterString1(final String value) {
        return Long.parseLong(Arrays.stream(value.split(""))
                .filter(i -> i.matches("[^a-z]"))
                .collect(Collectors.joining("")));
    }
}
