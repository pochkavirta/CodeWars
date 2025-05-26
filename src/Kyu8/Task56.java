package Kyu8;

//TODO Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

public class Task56 {
    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93));
        System.out.println(getGrade(70, 70, 100));
        System.out.println(getGrade(70, 70, 70));
        System.out.println(getGrade(65, 70, 59));
        System.out.println(getGrade(44, 55, 52));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        return average >= 90 ? 'A'
                : average >= 80 ? 'B'
                : average >= 70 ? 'C'
                : average >= 60 ? 'D'
                : 'F';
    }
}
