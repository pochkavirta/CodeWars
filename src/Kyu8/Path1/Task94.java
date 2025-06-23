package Kyu8.Path1;

//TODO Create a method to see whether the string is ALL CAPS.

public class Task94 {
    public static void main(String[] args) {
        System.out.println(isUpperCase("c"));
        System.out.println(isUpperCase("C"));
        System.out.println(isUpperCase("hello I AM DONALD"));
        System.out.println(isUpperCase("HELLO I AM DONALD"));
        System.out.println(isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"));
        System.out.println(isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"));
    }

    public static boolean isUpperCase(String s) {
        return s.toUpperCase().equals(s);
    }
}
