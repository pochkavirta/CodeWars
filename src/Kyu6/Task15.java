package Kyu6;

//TODO A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The
// quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
// Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        Task15 t = new Task15();
        System.out.println(t.check("The quick brown fox jumps over the lazy dog."));
        System.out.println(t.check("You shall not pass!"));
    }

    public boolean check(String sentence) {
        return Arrays.stream(sentence.toLowerCase()
                        .split(""))
                .distinct()
                .filter(i -> i.matches("[a-z]"))
                .count() == 26;
    }
}
