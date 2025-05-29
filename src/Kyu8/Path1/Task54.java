package Kyu8.Path1;

//TODO Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny,
// and would like to greet him slightly different. She added a special case to her function, but she made a mistake.

public class Task54 {
    public static void main(String[] args) {
        System.out.println(greet("Jim"));
        System.out.println(greet("Jane"));
        System.out.println(greet("Simon"));
        System.out.println(greet("Johnny"));
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
