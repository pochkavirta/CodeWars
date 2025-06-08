package Kyu7.Path1;

//TODO Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
// Write a function which takes a list of strings and returns each line prepended by the correct number.
// The numbering starts at 1. The format is n: string. Notice the colon and space in between.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task35 {
    public static void main(String[] args) {
        System.out.println(number(List.of()));
        System.out.println(number(List.of("a", "b", "c")));
        System.out.println(number(List.of("", "", "", "", "")));
    }

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        IntStream.rangeClosed(1, lines.size())
                .mapToObj(String::valueOf)
                .map(i -> i + ": " + lines.get(Integer.parseInt(i) - 1))
                .forEach(result::add);
        return result;
    }
}
