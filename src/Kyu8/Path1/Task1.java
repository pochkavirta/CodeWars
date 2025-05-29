package Kyu8.Path1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(1));
        System.out.println(evenOrOdd(2));
        System.out.println(evenOrOdd(3));
        System.out.println(evenOrOdd(0));
    }

    public static String evenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}