package Kyu8;

//TODO Complete the solution so that it reverses all of the words within the string passed in.
// Words are separated by exactly one space and there are no leading or trailing spaces.

import java.util.Arrays;
import java.util.List;

public class Task55 {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world!"));
        System.out.println(reverseWords("yoda doesn't speak like this"));
        System.out.println(reverseWords("foobar"));
        System.out.println(reverseWords("kata editor"));
        System.out.println(reverseWords("row row row your boat"));
        System.out.println(reverseWords(""));
    }

    public static String reverseWords(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        return String.join(" ", list.reversed());
    }
}
