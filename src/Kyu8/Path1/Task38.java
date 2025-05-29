package Kyu8.Path1;

//TODO Write a function which converts the input string to uppercase.

public class Task38 {
    public static void main(String[] args) {
        System.out.println(makeUpperCase("hello"));
        System.out.println(makeUpperCase("hello world"));
        System.out.println(makeUpperCase("hello world !"));
        System.out.println(makeUpperCase("heLlO wORLd !"));
        System.out.println(makeUpperCase("1,2,3 hello world!"));
    }

    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }
}
