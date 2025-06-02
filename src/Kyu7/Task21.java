package Kyu7;

//TODO Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

public class Task21 {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("ninja", "ja"));
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
