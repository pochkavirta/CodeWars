package Kyu7.Path2;

//TODO Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

public class Task77 {
    public static void main(String[] args) {
        System.out.println(greet("riley"));
        System.out.println(greet("JACK"));
    }

    public static String greet(String name) {
        return String.format("Hello %s%s!",
                name.toUpperCase().charAt(0),
                name.toLowerCase().substring(1));
    }
}

