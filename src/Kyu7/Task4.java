package Kyu7;

//TODO In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }

    public static String highAndLow(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
