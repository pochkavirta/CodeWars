package Kyu8.Path1;

//TODO Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

public class Task41 {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin("509321967506747"));
        System.out.println(fakeBin("366058562030849490134388085"));
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
    }
}
