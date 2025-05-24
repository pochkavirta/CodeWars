package Kyu8;

//TODO Write a function to split a string and convert it into an array of words.

import java.util.Arrays;

public class Task52 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
