package Kyu6;

//TODO Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
// number of characters then it should replace the missing second character of the final pair with an underscore ('_').

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(null)));
        System.out.println(Arrays.toString(solution("abc")));
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("LovePizza")));
    }

    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) return new String[0];
        if (s.length() % 2 == 1) {
            s = s + "_";
        }
        return s.split("(?<=\\G.{2})");
    }
}
