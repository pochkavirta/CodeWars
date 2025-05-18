package Kyu8;

import java.util.stream.IntStream;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78, 56, -2, 12, -8}));
        System.out.println(findSmallestInt(new int[]{Integer.MIN_VALUE, -666}));
        System.out.println(findSmallestInt(new int[]{666, Integer.MIN_VALUE}));
        System.out.println(findSmallestInt(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}));
        System.out.println(findSmallestInt(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}));
    }

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt(); //мин
    }

    public static int findSmallestInt2(int[] args) {
        return IntStream.of(args).reduce(args[0], Math::min); //редус
    }
}