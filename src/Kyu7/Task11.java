package Kyu7;

//TODO Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

public class Task11 {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replace("o", "").length() == str.replace("x", "").length();
    }
}
