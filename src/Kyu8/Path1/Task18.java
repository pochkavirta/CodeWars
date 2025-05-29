package Kyu8.Path1;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitize(0)));
    }

    public static int[] digitize(long n) {
        String number = Long.toString(n);
        return Arrays.stream(new StringBuilder(number)
                        .reverse()
                        .toString()
                        .split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
