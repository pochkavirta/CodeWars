package Kyu7.Path2;

//TODO Return an array containing the numbers from 1 to N, where N is the parametered value.
// Replace certain values however if any of the following conditions are met:
// If the value is a multiple of 3: use the value "Fizz" instead
// If the value is a multiple of 5: use the value "Buzz" instead
// If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task69 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1)));
        System.out.println(Arrays.toString(fizzBuzz(10)));
        System.out.println(Arrays.toString(fizzBuzz(15)));
    }

    public static String[] fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 5 == 0 && i % 3 == 0 ? "FizzBuzz"
                        : i % 3 == 0 ? "Fizz"
                        : i % 5 == 0 ? "Buzz" : i + "")
                .toArray(String[]::new);
    }
}
