package Kyu8;

//TODO Given a non-negative integer,3 for example, return a string with a murmur:
// "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task51 {
    public static void main(String[] args) {
        System.out.println(countingSheep(0));
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        return num > 0 ? IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining()) : "";
    }
}
