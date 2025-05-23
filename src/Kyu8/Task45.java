package Kyu8;

/*TODO Create a function with two arguments that will return an array of the first n multiples of x.
   Assume both the given number and the number of times to count will be positive numbers greater than 0.
   Return the results as an array or list ( depending on language ).*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task45 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println(Arrays.toString(countBy(2, 5)));
        System.out.println(Arrays.toString(countBy(3, 7)));
        System.out.println(Arrays.toString(countBy(50, 5)));
        System.out.println(Arrays.toString(countBy(100, 6)));
    }

    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }
}
