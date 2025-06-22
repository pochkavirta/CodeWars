package Kyu7.Path1;

//TODO This program tests the life of an evaporator containing a gas.
// We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day)
// and the threshold (threshold) in percentage beyond which the evaporator is no longer useful. All numbers are strictly positive.
// The program reports the nth day (as an integer) on which the evaporator will be out of use.

public class Task68 {
    public static void main(String[] args) {
        System.out.println(evaporator(10, 3, 5));
        System.out.println(evaporator(10, 10, 5));
        System.out.println(evaporator(10, 10, 10));
    }

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        threshold = content * (threshold / 100);
        while (content > threshold) {
            content -= content * (evap_per_day / 100);
            days++;
        }
        return days;
    }
}
