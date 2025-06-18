package Kyu7.Path2;

//TODO I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 1 and 50.
// Example
// n = 3, so I expect a 3x3 square back just like below as a string:

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task82 {
    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println(generateShape(5));
        System.out.println(generateShape(8));
    }

    public static final String generateShape(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> "+".repeat(n))
                .collect(Collectors.joining("\n"));
    }
}
