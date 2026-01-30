package Kyu8.Path2;

//TODO Write a function that checks if a given string (case insensitive) is a palindrome.
// A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards, such as madam or racecar.

public class Task100 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("Abba"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Bob"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("AbBa"));
        System.out.println(isPalindrome(""));
    }

    public static Boolean isPalindrome(String x) {
        return x.toLowerCase().contentEquals(new StringBuilder(x.toLowerCase()).reverse());
    }
}
