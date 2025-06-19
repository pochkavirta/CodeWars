package Kyu7.Path2;

//TODO Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
// Note that the array size is at least 2 and consists a mixture of positive, negative integers and also zeroes.

import java.util.stream.IntStream;

public class Task86 {
    public static void main(String[] args) {
        Task86 task86 = new Task86();
        System.out.println(task86.adjacentElementsProduct(new int[]{1, 2, 3}));
        System.out.println(task86.adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
        System.out.println(task86.adjacentElementsProduct(new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    }

    public int adjacentElementsProduct(int[] array) {
        return IntStream.range(0, array.length - 1)
                .map(x -> array[x] * array[x + 1])
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public int adjacentElementsProduct1(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > result) {
                result = array[i] * array[i + 1];
            }
        }
        return result;
    }
}
