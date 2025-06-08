package Kyu8.Path1;

//TODO Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message:
// If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
// If he doesn't get 10 hoops, return the string "Keep at it until you get it".

public class Task76 {
    public static void main(String[] args) {
        System.out.println(hoopCount(11));
        System.out.println(hoopCount(7));
    }

    public static String hoopCount(int n) {
        return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }
}
