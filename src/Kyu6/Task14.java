package Kyu6;

//TODO Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first
// word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
// also often referred to as Pascal case). The next words should be always capitalized.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }

    static String toCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String result = Arrays.stream(s.split("[-_]"))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining());
        return s.charAt(0) + result.substring(1);
    }
}
