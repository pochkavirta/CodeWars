package Kyu8;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(5, ""));
        System.out.println(repeatStr(0, "kata"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}