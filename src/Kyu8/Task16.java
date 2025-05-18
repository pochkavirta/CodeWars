package Kyu8;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(liters(3));
        System.out.println(liters(6.7));
        System.out.println(liters(11.8));
    }

    public static int liters(double time) {
        return (int) time / 2;
    }
}
