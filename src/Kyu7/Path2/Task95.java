package Kyu7.Path2;

//TODO Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
// Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
// Each part will be in a string
// Elements of a pair must be in the same order as in the original array.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task95 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(partlist(new String[]{"az", "toto", "picaro", "zone", "kiwi"})));
    }

    public static String[][] partlist(String[] arr) {
        String[][] returnArray = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }
        return returnArray;
    }

    public static String[][] partlist1(String[] arr) {
        return IntStream.range(1, arr.length)
                .mapToObj(i -> new String[]{
                        Arrays.stream(arr, 0, i).collect(Collectors.joining(" ")),
                        Arrays.stream(arr, i, arr.length).collect(Collectors.joining(" "))}
                )
                .toArray(String[][]::new);
    }

    public static String[][] partlist2(String[] arr) {
        String[][] result = new String[arr.length - 1][2];
        List<String> list = Arrays.asList(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    result[i][j] = list.stream()
                            .limit(i + 1)
                            .collect(Collectors.joining(" "));
                } else {
                    result[i][j] = list.stream()
                            .skip(i + 1)
                            .collect(Collectors.joining(" "));
                }
            }
        }
        return result;
    }
}
