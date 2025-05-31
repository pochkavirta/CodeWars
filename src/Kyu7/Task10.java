package Kyu7;

/*TODO An isogram is a word that has no repeating letters, consecutive or non-consecutive.
   Implement a function that determines whether a string that contains only letters is an isogram.
   Assume the empty string is an isogram. Ignore letter case. */

public class Task10 {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
