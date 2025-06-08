package Kyu8.Path1;

//TODO In this Kata we are passing a number (n) into a function.
// Your code will determine if the number passed is even (or not).
// The function needs to return either a true or false.
// Numbers may be positive or negative, integers or floats.
// Floats with decimal part non equal to zero are considered UNeven for this kata.

public class Task87 {
    public static void main(String[] args) {
        Task87 t = new Task87();
        System.out.println(t.isEven(0));
        System.out.println(t.isEven(0.5));
        System.out.println(t.isEven(1));
        System.out.println(t.isEven(2));
        System.out.println(t.isEven(-4));
    }

    public boolean isEven(double n) {
        return n % 2 == 0;
    }
}
