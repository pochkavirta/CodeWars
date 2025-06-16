package Kyu7.Path1;

//TODO An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
// Note: anagrams are case insensitive
// Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task45 {
    public static void main(String[] args) {
        System.out.println(isAnagram("", ""));
        System.out.println(isAnagram("aa", "aa"));
        System.out.println(isAnagram("foefet", "toffee"));
        System.out.println(isAnagram("a", "aaa"));
        System.out.println(isAnagram("aaa", "a"));
        System.out.println(isAnagram("ab", "cdcd"));
        System.out.println(isAnagram("aab", "abb"));
        System.out.println(isAnagram("ac", "bb"));
    }

    public static boolean isAnagram(String a, String b) {
        List<String> list1 = new ArrayList<>(Arrays.stream(a.split(""))
                .map(String::toUpperCase)
                .sorted()
                .toList());
        List<String> list2 = new ArrayList<>(Arrays.stream(b.split(""))
                .map(String::toUpperCase)
                .sorted()
                .toList());
        return list1.equals(list2);
    }
}
