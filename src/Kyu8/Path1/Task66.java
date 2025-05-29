package Kyu8.Path1;

/*TODO It's the academic year's end, fateful moment of your school report. The averages must be calculated.
   All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
   Return the average of the given array rounded down to its nearest integer.
   The array will never be empty.*/

import java.util.Arrays;

public class Task66 {
    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{2, 2, 2, 2}));
        System.out.println(getAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println(getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }

    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().orElse(0);
    }
}