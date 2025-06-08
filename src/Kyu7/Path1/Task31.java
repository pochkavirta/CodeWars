package Kyu7.Path1;

//TODO Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task31 {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("double  spaces"));
        System.out.println(reverseWords("  elbuod  decaps  sdrow  "));
        System.out.println(reverseWords("  elbuod  decaps  sdrow     "));
    }

    public static String reverseWords(final String original) {
        return Arrays.stream(original.split(" ", -1))
                .map(i -> new StringBuilder(i).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
