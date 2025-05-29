package Kyu8.Path1;

/*TODO There was a test in your class and you passed it. Congratulations!
   But you're an ambitious person. You want to know if you're better than the average student in your class.
   You receive an array with your peers' test scores. Now calculate the average and compare your score!
   Return true if you're better, else false!*/

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{2, 3}, 5));
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(betterThanAverage(new int[]{100, 90}, 11));
        System.out.println(betterThanAverage(new int[]{50, 50, 50}, 50));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints)
                .average()
                .orElse(0) < yourPoints;
    }
}
