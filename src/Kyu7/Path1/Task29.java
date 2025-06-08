package Kyu7.Path1;

//TODO Given an array of ones and zeroes, convert the equivalent binary value to an integer.
// Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task29 {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder result = new StringBuilder();
        for (Integer i : binary) {
            result.append(i);
        }
        return Integer.parseInt(result.toString(), 2);
    }
}
