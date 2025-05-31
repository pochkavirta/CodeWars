package Kyu6;

//TODO Write a function that takes in a string of one or more words, and returns the same string, but with all
// words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will
// consist of only letters and spaces. Spaces will be included only when more than one word is present.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }

    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() >= 5 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}
