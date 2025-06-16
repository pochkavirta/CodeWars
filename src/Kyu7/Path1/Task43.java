package Kyu7.Path1;

//TODO Given an integer as input, can you round it to the next (meaning, "greater than or equal") multiple of 5?

public class Task43 {
    public static void main(String[] args) {
        System.out.println(roundToNext5(0));
        System.out.println(roundToNext5(2));
        System.out.println(roundToNext5(3));
        System.out.println(roundToNext5(12));
        System.out.println(roundToNext5(21));
        System.out.println(roundToNext5(30));
        System.out.println(roundToNext5(-2));
        System.out.println(roundToNext5(-5));
    }

    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}
