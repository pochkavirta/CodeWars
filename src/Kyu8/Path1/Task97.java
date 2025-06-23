package Kyu8.Path1;

//TODO Create a function finalGrade, which calculates the final grade of a student depending on two parameters:
// a grade for the exam and a number of completed projects.
// This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);

public class Task97 {
    public static void main(String[] args) {
        System.out.println(finalGrade(99, 1));
        System.out.println(finalGrade(76, 5));
        System.out.println(finalGrade(76, 4));
        System.out.println(finalGrade(52, 1));
    }

    public static int finalGrade(int exam, int projects) {
        return exam > 90 || projects > 10 ? 100
                : exam > 75 && projects >= 5 ? 90
                : exam > 50 && projects >= 2 ? 75
                : 0;
    }
}