package Kyu7.Path1;

//TODO Your task is to make a function that can take any non-negative integer as an argument and return it with
// its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(sortDesc(0));
        System.out.println(sortDesc(15));
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        return Integer.parseInt(Arrays.stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining())); //Конкатенация через редус: .reduce("", (a, b) -> a + b)
    }
}
