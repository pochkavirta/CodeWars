package Kyu8;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));
        System.out.println(century(2742));
        System.out.println(century(89));
    }

    public static int century(int number) {
        return (number + 99) / 100; //математика
    }

    public static int century2(int number) {
        return (number % 100 > 0) ? number / 100 + 1 : number / 100; //тернарный оператор
    }
}
