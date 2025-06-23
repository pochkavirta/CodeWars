package Kyu8.Path1;

//TODO In this game, the hero moves from left to right. The player rolls the dice and moves the number of spaces indicated by the dice two times.
// Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.

public class Task91 {
    public static void main(String[] args) {
        System.out.println(move(0, 4));
        System.out.println(move(3, 6));
        System.out.println(move(2, 5));
    }

    public static int move(int position, int roll) {
        return position + (roll * 2);
    }
}
