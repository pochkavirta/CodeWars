package Kyu8.Path1;

//TODO Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task67 {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }

    public static String doubleChar(String s) {
        List<String> list = Arrays.asList(s.split(""));
        return list.stream().map(i -> i + i).collect(Collectors.joining());
    }
}
