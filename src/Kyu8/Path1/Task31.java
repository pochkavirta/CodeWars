package Kyu8.Path1;

//TODO Implement a function which convert the given boolean value into its string representation.

public class Task31 {
    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
    }

    public static String convert(boolean b) {
        return (b ? "true" : "false");
    }
}
