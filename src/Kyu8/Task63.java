package Kyu8;

//TODO Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

public class Task63 {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!!!"));
    }

    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}