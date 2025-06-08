package Kyu8.Path1;

//TODO The cockroach is one of the fastest insects. Write a function which takes its
// speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).

public class Task77 {
    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
        System.out.println(cockroachSpeed(1.09));
        System.out.println(cockroachSpeed(0));
    }

    public static int cockroachSpeed(double x) {
        double result = x * 100000 / 3600;
        return (int) result;
    }
}
