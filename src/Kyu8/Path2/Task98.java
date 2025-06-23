package Kyu8.Path2;

//TODO Given three integers a, b, and c, return the largest number obtained after inserting the operators +, *, and
// parentheses (). In other words, try every combination of a, b, and c with the operators, without reordering the
// operands, and return the maximum value.

public class Task98 {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(2, 1, 1));
        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(expressionsMatter(1, 3, 1));
        System.out.println(expressionsMatter(2, 2, 2));
        System.out.println(expressionsMatter(9, 1, 1));
        System.out.println(expressionsMatter(3, 3, 3));
    }

    public static int expressionsMatter(int a, int b, int c) {
        return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
    }

    public static int expressionsMatter1(int a, int b, int c) {
        int sum = 0;
        if (sum < a + b + c) sum = a + b + c;
        if (sum < a * b * c) sum = a * b * c;
        if (sum < a * b + c) sum = a * b + c;
        if (sum < a * (b + c)) sum = a * (b + c);
        if (sum < a + b * c) sum = a + b * c;
        if (sum < (a + b) * c) sum = (a + b) * c;
        return sum;
    }
}
