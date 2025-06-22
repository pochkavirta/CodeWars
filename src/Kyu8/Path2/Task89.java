package Kyu8.Path2;

//TODO Messi is a soccer player with goals in three leagues:
// LaLiga
// Copa del Rey
// Champions
// Complete the function to return his total number of goals in all three leagues.

public class Task89 {
    public static void main(String[] args) {
        System.out.println(goals(5, 10, 2));
        System.out.println(goals(0, 0, 0));
        System.out.println(goals(43, 10, 5));
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
