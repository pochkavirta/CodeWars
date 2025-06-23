package Kyu8.Path1;

//TODO Now you have to write a function that takes an argument and returns the square of it.

public class Task90 {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square(50));
        System.out.println(square(1));
    }

    public static int square(int n) {
        return (int) Math.pow(n, 2);
    }
}
