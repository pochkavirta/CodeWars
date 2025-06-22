package Kyu6;

//TODO Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way
// until a single-digit number is produced. The input will be a non-negative integer.

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
    }

    public static int digital_root(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return (n);
    }

    public static int digital_root1(int n) {
        while (n > 9) {
            List<Integer> digits = Arrays.stream(String.valueOf(n).split(""))
                    .map(Integer::valueOf)
                    .toList();
            n = digits.stream()
                    .mapToInt(Integer::valueOf)
                    .sum();
        }
        return n;
    }
}

