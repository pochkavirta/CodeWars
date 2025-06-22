package Kyu6;

//TODO Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
// digits that occur more than once in the input string. The input string can be assumed to contain only alphabets
// (both uppercase and lowercase) and numeric digits.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            String firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }

    public static int duplicateCount1(String text) {
        int result = 0;
        String firstLetter;
        text = Arrays.stream(text.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
        while (!text.isEmpty()) {
            firstLetter = text.substring(0, 1);
            if (text.contains(firstLetter + firstLetter)) {
                result++;
            }
            text = text.replace(firstLetter, "");
        }
        return result;
    }
}

