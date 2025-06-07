package Kyu7;

//TODO Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
// a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
// The four operators are "add", "subtract", "divide", "multiply".

public class Task42 {
    public static void main(String[] args) {
        System.out.println(arithmetic(1, 2, "add"));
        System.out.println(arithmetic(8, 2, "subtract"));
        System.out.println(arithmetic(5, 2, "multiply"));
        System.out.println(arithmetic(8, 2, "divide"));
    }

    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
    }
}
