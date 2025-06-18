package Kyu7.Path2;

//TODO Your task is to remove all duplicate words from a string, leaving only single (first) words entries.
// Input:
// 'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'
// Output:
// 'alpha beta gamma delta'

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task79 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        System.out.println(removeDuplicateWords("my cat is my cat fat"));
    }

    public static String removeDuplicateWords(String s) {
        return Arrays.stream(s.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}

