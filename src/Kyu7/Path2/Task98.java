package Kyu7.Path2;

//TODO Implement a function, which takes a non-negative integer, representing the number of eggs to boil. It must
// return the time in minutes (integer), which it takes to have all the eggs boiled.

public class Task98 {
    public static void main(String[] args) {
        System.out.println(cookingTime(0));
        System.out.println(cookingTime(5));
        System.out.println(cookingTime(10));
    }

    public static int cookingTime(int eggs) {
        int timer = 0;
        while (eggs > 0) {
            timer += 5;
            eggs -= 8;
        }
        return timer;
    }
}
