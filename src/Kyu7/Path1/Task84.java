package Kyu7.Path1;

//TODO We want to know the index of the vowels in a given word, for example, there are two vowels in the word super (the second and fourth letters).
// So given a string "super", we should return a list of [2, 4].

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task84 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelIndices("Mmmm")));
        System.out.println(Arrays.toString(vowelIndices("Super")));
        System.out.println(Arrays.toString(vowelIndices("Apple")));
        System.out.println(Arrays.toString(vowelIndices("YoMama")));
        System.out.println(Arrays.toString(vowelIndices("QRsIIfpATWLNGrYmJ")));
    }

    public static int[] vowelIndices(String word) {
        return IntStream.range(0, word.length())
                .filter(i -> "aeiouyAEIOUY".indexOf(word.charAt(i)) != -1)
                .map(i -> i + 1)
                .toArray();
    }
}
