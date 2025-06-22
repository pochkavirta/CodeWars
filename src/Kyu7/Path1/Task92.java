package Kyu7.Path1;

//TODO Given a string made of digits [0-9], return a string where each digit is repeated a number of times equals to its value.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task92 {
    public static void main(String[] args) {
        System.out.println(explode("312"));
        System.out.println(explode("102269"));
    }

    public static String explode(String digits) {
        return Arrays.stream(digits.split(""))
                .map(i -> i.repeat(Integer.parseInt(i)))
                .collect(Collectors.joining());
    }

    public static String explode1(String digits) {
        return Arrays.stream(digits.split(""))
                .map(i -> {
                    int count = Integer.parseInt(i);
                    return i.repeat(count);
                })
                .collect(Collectors.joining());
    }
}

