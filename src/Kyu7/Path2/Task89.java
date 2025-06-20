package Kyu7.Path2;

//TODO Given a string s, your task is to return another string such that even-indexed and odd-indexed characters of s are
// grouped and the groups are space-separated. Even-indexed group comes as first, followed by a space, and then by the odd-indexed part.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task89 {
    public static void main(String[] args) {
        System.out.println(sortMyString("CodeWars"));
        System.out.println(sortMyString("||||||||"));
        System.out.println(sortMyString("01234567"));
    }

    public static String sortMyString(String s) {
        List<String> list = Arrays.stream(s.split(""))
                .toList();
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(list::get)
                .collect(Collectors.joining()) + " " + IntStream.range(0, list.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(list::get)
                .collect(Collectors.joining());
    }
}

