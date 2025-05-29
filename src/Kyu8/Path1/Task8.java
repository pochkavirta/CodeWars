package Kyu8.Path1;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
        System.out.println(remove("ok"));
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}