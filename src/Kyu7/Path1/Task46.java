package Kyu7.Path1;

//TODO Write a function that takes a single non-empty string of only lowercase and uppercase ascii letters (word) as
// its argument, and returns an ordered list containing the indices of all capital (uppercase) letters in the string.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.IntStream.rangeClosed;

public class Task46 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitals("CodEWaRs")));
        System.out.println(Arrays.toString(capitals("aAbB")));
        System.out.println(Arrays.toString(capitals("AAA")));
        System.out.println(Arrays.toString(capitals("abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(capitals("ZYXWVUTSRQPONMLKJIHGFEDCBA")));
        System.out.println(Arrays.toString(capitals("")));
    }

    public static int[] capitals(String s) {
        return rangeClosed(0, s.length() - 1)
                .filter(i -> Character.isUpperCase(s.charAt(i)))
                .toArray();
    }

    public static int[] capitals1(String s) {
        List<Integer> list = new ArrayList<>();
        String letter;
        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i) + "";
            if (letter.matches("[A-Z]")) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
