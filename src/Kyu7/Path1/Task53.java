package Kyu7.Path1;

//TODO Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.

public class Task53 {
    public static void main(String[] args) {
        System.out.println(sumOfAngles(3));
        System.out.println(sumOfAngles(4));
    }

    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }
}