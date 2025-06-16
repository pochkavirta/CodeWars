package Kyu7.Path1;

//TODO You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any
// string in the first array and y be any string in the second array.
// Find max(abs(length(x) − length(y)))
// If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

import java.util.Arrays;

public class Task61 {
    public static void main(String[] args) {
        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"},
                new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
        System.out.println(mxdiflg(new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"},
                new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}));
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int xMin = Arrays.stream(a1).mapToInt(String::length).min().getAsInt();
        int xMax = Arrays.stream(a1).mapToInt(String::length).max().getAsInt();
        int yMin = Arrays.stream(a2).mapToInt(String::length).min().getAsInt();
        int yMax = Arrays.stream(a2).mapToInt(String::length).max().getAsInt();
        return Math.max(Math.abs(xMin - yMax), xMax - yMin);
    }
}