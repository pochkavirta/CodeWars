package Kyu8.Path2;

//TODO It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?
// Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.
// If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.
// Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, Java, Scala, and Julia),
// "$" (C#, C++, Dart, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) or "¥" (Rust).

public class Task71 {
    public static void main(String[] args) {
        System.out.println(bonusTime(10000, true));
        System.out.println(bonusTime(25000, true));
        System.out.println(bonusTime(10000, false));
        System.out.println(bonusTime(60000, false));
        System.out.println(bonusTime(2, true));
        System.out.println(bonusTime(78, false));
        System.out.println(bonusTime(67890, true));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + salary * 10 : "£" + salary;
    }
}
