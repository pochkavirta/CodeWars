package Kyu7.Path1;

/*TODO Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
   For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
   Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(765));
        System.out.println(squareDigits(0));
    }

    public static int squareDigits(int n) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(n).split(""))
                        .mapToInt(Integer::parseInt)
                        .map(d -> d * d)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()));
    }
}
