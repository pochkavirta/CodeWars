package Kyu8.Path1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }

    public static String solution(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
}