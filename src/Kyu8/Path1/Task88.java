package Kyu8.Path1;

//TODO I have a cat and a dog.
// I got them at the same time as kitten/puppy. That was humanYears years ago.
// Return their respective ages now as [humanYears,catYears,dogYears]

import java.util.Arrays;

public class Task88 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return humanYears == 1 ? new int[]{1, 15, 15}
                : humanYears == 2 ? new int[]{2, 24, 24}
                : new int[]{humanYears, 24 + (humanYears - 2) * 4, 24 + (humanYears - 2) * 5};
    }
}
