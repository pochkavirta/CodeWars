package Kyu8;

//TODO Let's play! You have to return which player won! In case of a draw return Draw!.

public class Task50 {
    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "rock"));

        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "paper"));

        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "rock"));
    }

    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!"
                : (p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))
                ? "Player 1 won!" : "Player 2 won!";
    }
}
