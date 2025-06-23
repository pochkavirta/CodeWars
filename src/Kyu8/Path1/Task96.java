package Kyu8.Path1;

//TODO Define String.prototype.toAlternatingCase (or a similar function/method such as
// to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for
// details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task96 {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));
        System.out.println(toAlternativeString("HELLO WORLD"));
        System.out.println(toAlternativeString("hello WORLD"));
        System.out.println(toAlternativeString("HeLLo WoRLD"));
        System.out.println(toAlternativeString("12345"));
        System.out.println(toAlternativeString("1a2b3c4d5e"));
        System.out.println(toAlternativeString("StringUtils.toAlternatingCase"));
    }

    public static String toAlternativeString(String string) {
        return Arrays.stream(string.split(""))
                .map(i -> i.matches("[A-Z]") ? i.toLowerCase() : i.toUpperCase())
                .collect(Collectors.joining());
    }
}
