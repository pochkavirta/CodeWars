package Kyu7.Path1;

/*TODO When writing on Twitter, he is known for almost always capitalizing every word. For simplicity,
   you'll have to capitalize each word, check out how contractions are expected to be in the example below.
   Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes
   from Jaden Smith, but they are not capitalized in the same way he originally typed them. */

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        return phrase == null || phrase.isEmpty() ? null : Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }
}
