package Kyu7.Path1;

//TODO Implement a function that accepts 3 integer values a, b, c. The function
// should return true if a triangle can be built with the sides of given length and false in any other case.
// (In this case, all triangles must have surface greater than 0 to be accepted).

public class Task27 {
    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
        System.out.println(isTriangle(7, 2, 2));
        System.out.println(isTriangle(2, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
