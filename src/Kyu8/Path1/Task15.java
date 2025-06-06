package Kyu8.Path1;

import java.util.Arrays;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{
                true, true, true, false, true, true, true, true, true, false, true,
                false, true, false, false, true, true, true, true, true, false,
                false, true, true}));
        System.out.println(countSheeps(new Boolean[]{}));
        System.out.println(countSheeps(new Boolean[]{false, null, true, false, null, null, true}));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true); //коллекции
    }

    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        return (int) Arrays                                                  //стримы
                .stream(arrayOfSheeps)
                .filter(sheep -> sheep != null && sheep)
                .count();
    }
}
