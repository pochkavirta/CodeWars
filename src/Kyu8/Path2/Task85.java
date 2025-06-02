package Kyu8.Path2;

//TODO When provided with a number between 0-9, return it in words. Note that the input is guaranteed to be within the range of 0-9.
// Input: 1
// Output: "One".

public class Task85 {
    public static void main(String[] args) {
        System.out.println(switchItUp(1));
        System.out.println(switchItUp(3));
        System.out.println(switchItUp(5));
    }

    public static String switchItUp(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> null;
        };
    }
}
