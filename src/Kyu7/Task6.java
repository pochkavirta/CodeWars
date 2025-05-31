package Kyu7;

//TODO In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
        System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(i -> i instanceof Integer)
                .collect(Collectors.toList());
    }
}
