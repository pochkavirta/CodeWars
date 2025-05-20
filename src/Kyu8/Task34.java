package Kyu8;

/*TODO Clock shows h hours, m minutes and s seconds after midnight.
   Your task is to write a function which returns the time since midnight in milliseconds.*/

public class Task34 {
    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }

    public static int Past(int h, int m, int s) {
        return ((h * 60 + m) * 60 + s) * 1000;
    }
}
