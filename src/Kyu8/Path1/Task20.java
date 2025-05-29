package Kyu8.Path1;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(isLove(1, 4));
        System.out.println(isLove(2, 2));
        System.out.println(isLove(1, 1));
        System.out.println(isLove(0, 1));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}
