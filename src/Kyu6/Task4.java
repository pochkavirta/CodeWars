package Kyu6;

//TODO Given an array of integers, find the one that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

import static java.util.Arrays.stream;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        System.out.println(findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

    public static int findIt(int[] a) {
        return stream(a).reduce(0, (x, y) -> x ^ y);
    }

    public static int findIt2(int[] a) {
        int count = 1;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    count += 1;
                }
            }
            if (count % 2 == 1) {
                result = a[i];
                break;
            }
            count = 1;
        }
        return result;
    }
}
