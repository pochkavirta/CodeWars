package Kyu8.Path1;

//TODO Write a function named setAlarm/set_alarm/set-alarm/setalarm (depending on language) which receives two parameters.
// The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.

public class Task73 {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(false, true));
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
