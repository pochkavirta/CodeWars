package Kyu7.Path1;

//TODO Given an array of positive integers (the weights of the people), return a new array / tuple of two integers
// (depending on your language), whereby the first one is the total weight of team 1, and the second one is the total
// weight of team 2. Note that the array will never be empty.

import java.util.Arrays;

public class Task71 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{80})));
        System.out.println(Arrays.toString(rowWeights(new int[]{100, 50})));
        System.out.println(Arrays.toString(rowWeights(new int[]{50, 60, 70, 80})));
        System.out.println(Arrays.toString(rowWeights(new int[]{13, 27, 49})));
        System.out.println(Arrays.toString(rowWeights(new int[]{70, 58, 75, 34, 91})));
        System.out.println(Arrays.toString(rowWeights(new int[]{29, 83, 67, 53, 19, 28, 96})));
        System.out.println(Arrays.toString(rowWeights(new int[]{100, 50})));
        System.out.println(Arrays.toString(rowWeights(new int[]{100, 51, 50, 100})));
        System.out.println(Arrays.toString(rowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61})));
    }

    public static int[] rowWeights(final int[] weights) {
        int[] massive = new int[]{0, 0};
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                massive[0] += weights[i];
            } else {
                massive[1] += weights[i];
            }
        }
        return massive;
    }
}
