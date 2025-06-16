package Kyu7.Path1;

//TODO Given a string str, reverse it and omit all non-alphabetic characters.

public class Task52 {
    public static void main(String[] args) {
        System.out.println(reverseLetter("kris_han"));
        System.out.println(reverseLetter("ultr53o?n"));
        System.out.println(reverseLetter("ab23c"));
        System.out.println(reverseLetter("krish21an"));
    }

    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", ""))
                .reverse()
                .toString();
    }
}
