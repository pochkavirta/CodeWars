package Kyu8.Path2;

//TODO Create a function that accepts a string and a single character,
// and returns an integer of the count of occurrences the 2nd argument is found in the first one.
// If no occurrences can be found, a count of 0 should be returned.

public class Task79 {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o'));
        System.out.println(strCount("Hello", 'l'));
        System.out.println(strCount("", 'z'));
    }

    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }
}
