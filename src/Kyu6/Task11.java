package Kyu6;

//TODO You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
// integer N. Write a method that takes the array as an argument and returns this "outlier" N.

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 4, 6, 8, 10, 3}));
        System.out.println(find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println(find(new int[]{160, 3, 1719, 19, 11, 13, -21}));
        System.out.println(find(new int[]{2, 6, 8, -10, 3}));
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    public static int find(int[] integers) {
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;
        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }

    static int find1(int[] integers) {
        int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
        return odd.length == 1 ? odd[0] : even[0];
    }

    static int find2(int[] integers) {
        int even = 0, odd = 0;
        for (int i : integers) {
            i = i % 2 == 0 ? even++ : odd++;
        }
        return even > odd ? Arrays.stream(integers)
                .filter(i -> Math.abs(i) % 2 == 1)
                .findAny().orElse(666)
                : Arrays.stream(integers)
                .filter(i -> Math.abs(i) % 2 == 0)
                .findAny().orElse(777);
    }
}
