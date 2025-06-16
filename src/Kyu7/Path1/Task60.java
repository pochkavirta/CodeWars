package Kyu7.Path1;

//TODO Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

import java.util.Arrays;

public class Task60 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}})));
    }

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}
