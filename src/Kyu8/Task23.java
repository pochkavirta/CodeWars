package Kyu8;

public class Task23 {
    public static void main(String[] args) {
        System.out.println(paperWork(5, 5));
        System.out.println(paperWork(5, -5));
        System.out.println(paperWork(-5, -5));
        System.out.println(paperWork(0, 0));
    }

    public static int paperWork(int n, int m) {
        return (n <= 0 || m <= 0) ? 0 : n * m;
    }
}
