package Kyu7;

/*TODO Usually when you buy something, you're asked whether your credit card number, phone number or
   answer to your most secret question is still correct. However, since someone could look over your
   shoulder, you don't want that shown on your screen. Instead, we mask it.
   Your task is to write a function maskify, which changes all but the last four characters into '#'.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616")); //11 чисел
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    public static String maskify(String str) { //замена частями строки
        return str.length() <= 4 ? str
                : str.substring(0, str.length() - 4).replaceAll(".", "#")
                + str.substring(str.length() - 4);
    }

    public static String maskify1(String str) { //регулярки
        return str.replaceAll(".(?=.{4})", "#");
    }

    public static String maskify2(String str) { //стрим
        List<String> text = Arrays.asList(str.split(""));
        IntStream.range(0, str.length() - 4)
                .forEach(i -> text.set(i, "#"));
        return String.join("", text);
    }

    public static String maskify3(String str) { //цикл
        List<String> text = Arrays.asList(str.split(""));
        int i = 0;
        while (i + 5 <= str.length()) {
            text.set(i, "#");
            i++;
        }
        return String.join("", text);
    }
}

