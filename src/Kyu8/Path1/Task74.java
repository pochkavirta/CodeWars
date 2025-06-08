package Kyu8.Path1;

//TODO You have to write a function that accepts three parameters:
// cap is the amount of people the bus can hold excluding the driver.
// on is the number of people on the bus excluding the driver.
// wait is the number of people waiting to get on to the bus excluding the driver.
// If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

public class Task74 {
    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }

    public static int enough(int cap, int on, int wait) {
        return cap - (on + wait) >= 0 ? 0 : (on + wait) - cap;
    }
}
