package Kyu8;

public class Task24 {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
        System.out.println(areYouPlayingBanjo("rolf"));
        System.out.println(areYouPlayingBanjo("bravo"));
    }

    public static String areYouPlayingBanjo(String name) {
        return name.charAt(0) == 'R' || name.charAt(0) == 'r' ? name + " plays banjo" : name + " does not play banjo";
    }
}
