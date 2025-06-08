package Kyu7.Path1;

//TODO Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.
// The binary number returned should be a string.

public class Task25 {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
        System.out.println(binaryAddition(5, 9));
    }

    public static String binaryAddition(int a, int b) {
        return Integer.toString(a + b, 2);
    }
}
