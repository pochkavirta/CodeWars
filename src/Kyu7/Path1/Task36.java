package Kyu7.Path1;

//TODO Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, this wouldn't
// give him any profit at all if he was simply to buy and sell it at the same price. Instead, he's going to buy it for
// the lowest possible price and sell it at the highest.
// Write a function that returns both the minimum and maximum number of the given list/array.

import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{2334454, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{1})));
    }

    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};
    }
}
