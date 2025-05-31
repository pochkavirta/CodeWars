package Kyu6;

//TODO You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
// pictures or other items. We want to create the text that should be displayed next to such an item.
// Implement the function which takes an array containing the names of people that like an item.

public class Task3 {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        if (names == null || names.length == 0) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return names[0] + " likes this";
        }
        if (names.length == 2) {
            return String.join(" and ", names) + " like this";
        }
        if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    }
}
