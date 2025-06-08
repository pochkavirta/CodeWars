package Kyu7.Path1;

//TODO A -> T, T -> A, G -> C, C -> G

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        return Arrays.stream(dna.split(""))
                .map(a -> a.equals("A") ? "T" : a.equals("T") ? "A" : a.equals("G") ? "C" : a.equals("C") ? "G" : a)
                .collect(Collectors.joining());
    }
}

