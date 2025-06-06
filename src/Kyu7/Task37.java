package Kyu7;

//TODO You are given an odd-length array of integers, in which all of them are the same, except for one single number.
// Complete the method which accepts such an array, and returns that single different number.
// The input array will always be valid! (odd-length >= 3)

import java.util.Arrays;

public class Task37 {
    public static void main(String[] args) {
        System.out.println(stray(new int[]{1, 1, 2}));
        System.out.println(stray(new int[]{17, 17, 3, 17, 17, 17, 17}));
        System.out.println(stray(new int[]{2, 1, 1}));
        System.out.println(stray(new int[]{1, 2, 1}));
    }

    static int stray(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
    }

    static int stray1(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }

    static int stray2(int[] numbers) {
        int[] result = Arrays.stream(numbers).distinct().toArray();
        int count = 0;
        for (int number : numbers) {
            if (result[0] == number) {
                count++;
            }
        }
        return count > 1 ? result[1] : result[0];
    }
}
