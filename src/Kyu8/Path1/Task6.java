package Kyu8.Path1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}