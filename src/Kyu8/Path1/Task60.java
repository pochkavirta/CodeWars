package Kyu8.Path1;

//TODO You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
// If it is a square, return its area. If it is a rectangle, return its perimeter.

public class Task60 {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
        System.out.println(areaOrPerimeter(6, 10));
    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : 2 * l + 2 * w;
    }
}