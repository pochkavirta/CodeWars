package Kyu7;

//TODO In this kata you get the start number and the end number of a region and should return the count of all numbers
// except numbers with a 5 in it. The start and the end number are both inclusive!

import java.util.stream.IntStream;

public class Task38 {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9));
        System.out.println(dontGiveMeFive(4, 17));
        System.out.println(dontGiveMeFive(5, 84));
    }

    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end)
                .filter(i -> !String.valueOf(i).contains("5"))
                .count();
    }
}
