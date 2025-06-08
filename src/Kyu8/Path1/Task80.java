package Kyu8.Path1;

//TODO Your function takes two arguments:
// 1. current father's age (years)
// 2. current age of his son (years)
// Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
// The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.

public class Task80 {
    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 0));
        System.out.println(twiceAsOld(30, 7));
        System.out.println(twiceAsOld(45, 30));
        System.out.println(twiceAsOld(36, 7));
        System.out.println(twiceAsOld(55, 30));
    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - (sonYears + sonYears));
    }
}
