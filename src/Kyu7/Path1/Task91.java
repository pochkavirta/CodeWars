package Kyu7.Path1;

//TODO Create a function add(n)/Add(n) which returns a function that always adds n to any number
// Note for Java: the return type and methods have not been provided to make it a bit more challenging.

import java.util.function.IntUnaryOperator;

public class Task91 {
    public static void main(String[] args) {
        System.out.println(add(3).applyAsInt(5));
    }

    public static IntUnaryOperator add(int n) {
        return num -> num + n;
    }

    public static IntUnaryOperator add1(int n) {
        return new IntUnaryOperator() {
            public int applyAsInt(int x) {
                return x + n;
            }
        };
    }
}
