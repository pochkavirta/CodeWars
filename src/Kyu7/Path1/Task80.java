package Kyu7.Path1;

//TODO If　a = 1, b = 2, c = 3 ... z = 26
// Then l + o + v + e = 54
// and f + r + i + e + n + d + s + h + i + p = 108
// So friendship is twice as strong as love :-)
// Your task is to write a function which calculates the value of a word based off the sum of the alphabet positions of its characters.
// The input will always be made of only lowercase letters and will never be empty.

import java.util.stream.IntStream;

public class Task80 {
    public static void main(String[] args) {
        System.out.println(wordsToMarks("attitude"));
        System.out.println(wordsToMarks("friends"));
        System.out.println(wordsToMarks("family"));
        System.out.println(wordsToMarks("selfness"));
        System.out.println(wordsToMarks("knowledge"));
        System.out.println(wordsToMarks("incomprehensibility"));
    }

    public static int wordsToMarks(String text) {
        return IntStream.range(0, text.length())
                .map(i -> text.charAt(i) - 96)
                .sum();
    }
}

