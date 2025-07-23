package Kyu6;

//TODO Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
// Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
// If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        Map<Integer, String> wordsMap = new HashMap<>();
        for (String word : words.split(" ")) {
            wordsMap.put(Integer.parseInt(word.replaceAll("[a-zA-Z]", "")), word);
        }
        return String.join(" ", wordsMap.values());
    }

    public static String order1(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
