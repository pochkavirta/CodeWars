package Kyu8;

//TODO Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

public class Task61 {
    public static void main(String[] args) {
        System.out.println(greet("Daniel", "Daniel"));
        System.out.println(greet("Greg", "Daniel"));
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}