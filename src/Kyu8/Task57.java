package Kyu8;

//TODO Our team's match results are recorded in a collection of strings.
// Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Task57 {
    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
        System.out.println(points(new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
        System.out.println(points(new String[]{"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}));
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"}));
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"}));
    }

    public static int points(String[] games) {
        AtomicInteger points = new AtomicInteger(0);
        Arrays.stream(games)
                .forEach(i -> {
                    List<Integer> j = Arrays.stream(i.split(":")).map(Integer::valueOf).toList();
                    int result2 = j.get(0) > j.get(1) ? 3
                            : Objects.equals(j.get(0), j.get(1)) ? 1 : 0;
                    points.getAndAdd(result2);
                });
        return points.get();
    }

    public static int points2(String[] games) {
        return Arrays.stream(games)
                .mapToInt(score -> score.charAt(0) - score.charAt(2))
                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                .sum();
    }
}
