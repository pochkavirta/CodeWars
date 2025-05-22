package Kyu7;

/*TODO You are going to be given a non-empty string. Your job is to return the middle character(s) of the string.
   If the string's length is odd, return the middle character.
   If the string's length is even, return the middle 2 characters.*/

public class Task7 {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        int halfLength = word.length() / 2;
        return word.length() % 2 == 0 ? word.substring(halfLength - 1, halfLength + 1) : word.substring(halfLength, halfLength + 1);
    }
}
