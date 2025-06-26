package Kyu6;

//TODO The goal of this exercise is to convert a string to a new string where each character in the new string is
// "(" if that character appears only once in the original string, or ")" if that character appears more than once
// in the original string. Ignore capitalization when determining if a character is a duplicate.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
    }

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }

    static String encode1(String word) {
        List<String> letters = new ArrayList<>(List.of(word.toLowerCase().split("")));
        return letters.stream()
                .map(i -> {
                    int count = 0;
                    for (String s : letters) {
                        if (s.equals(i)) {
                            count++;
                        }
                    }
                    return count > 1 ? ")" : "(";
                })
                .collect(Collectors.joining());
    }
}
