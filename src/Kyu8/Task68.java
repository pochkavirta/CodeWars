package Kyu8;

/*TODO Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
   For example: month 2 (February), is part of the first quarter; month 6 (June), is part
   of the second quarter; and month 11 (November), is part of the fourth quarter.*/

public class Task68 {
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(11));
        System.out.println(quarterOf(12));
    }

    public static int quarterOf(int month) {
        return month >= 4 && month <= 6 ? 2 : month >= 7 && month <= 9 ? 3 : month >= 10 && month <= 12 ? 4 : 1;
    }
}
