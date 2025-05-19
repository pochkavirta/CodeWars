package Kyu8;

import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"wolf"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

    public static String warnTheSheep(String[] array) {
        int N = array.length - Arrays.asList(array).indexOf("wolf");
        return N == 1 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (N - 1) + "! You are about to be eaten by a wolf!";
    }
}
