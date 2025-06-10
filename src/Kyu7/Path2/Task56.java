package Kyu7.Path2;

//TODO In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is
// to convert that string to either lowercase only or uppercase only based on:
// -make as few changes as possible.
// -if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.

public class Task56 {
    public static void main(String[] args) {
        System.out.println(solve("code"));
        System.out.println(solve("CODe"));
        System.out.println(solve("COde"));
        System.out.println(solve("Code"));
    }

    public static String solve(final String str) {
        String strUpper = str.replaceAll("[a-z]", "");
        String strLower = str.replaceAll("[A-Z]", "");
        return strLower.length() >= strUpper.length() ? str.toLowerCase() : str.toUpperCase();
    }
}
