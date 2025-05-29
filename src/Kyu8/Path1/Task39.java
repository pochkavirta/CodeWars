package Kyu8.Path1;

/*TODO Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
   You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful,
   there shouldn't be a space at the beginning or the end of the sentence!*/

public class Task39 {
    public static void main(String[] args) {
        System.out.println(smash(new String[]{"hello"}));
        System.out.println(smash(new String[]{"hello", "world"}));
        System.out.println(smash(new String[]{"hello", "world", "this", "is", "great"}));
    }

    public static String smash(String[] words) {
        return String.join(" ", words);
    }
}
