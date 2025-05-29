package Kyu8.Path1;

//TODO Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language )
// that receive a list of integers as input, and return the largest and lowest number in that list, respectively. Each function returns one number.

import java.util.Arrays;

public class Task53 {
    public static void main(String[] args) {
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(min(new int[]{42, 54, 65, 87, 0}));
        System.out.println(max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        System.out.println(max(new int[]{5}));
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
