package Kyu7.Path2;

//TODO Complete the solution so that it returns the greatest sequence of five consecutive digits found within the
// number given. The number will be passed in as a string of only digits. It should return a five digit integer.
// The number passed may be as large as 1000 digits.

import java.util.stream.IntStream;

public class Task64 {
    public static void main(String[] args) {
        System.out.println(solve("283910"));
        System.out.println(solve("1234567890"));
        System.out.println(solve("731674765"));
    }

    public static int solve(final String digits) {
        return IntStream.range(0, digits.length() - 4)
                .mapToObj(i -> digits.substring(i, i + 5))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
    }

    public static int solve1(final String digits) {
        int result = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            int max = Integer.parseInt(digits.substring(i, i + 5));
            if (result < max) {
                result = max;
            }
        }
        return result;
    }
}
