package Kyu7.Path2;

//TODO Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26
// unique alphabetical characters, and returns a string containing the same characters in alphabetical order.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task73 {
    public static void main(String[] args) {
        System.out.println(new Task73().sortGiftCode("abcdef"));
        System.out.println(new Task73().sortGiftCode("pqksuvy"));
        System.out.println(new Task73().sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

    public String sortGiftCode(String code) {
        return Arrays.stream(code.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
