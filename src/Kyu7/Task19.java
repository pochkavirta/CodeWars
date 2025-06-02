package Kyu7;

//TODO Make a program that filters a list of strings and returns a list with only your friends name in it.
// If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

import java.util.List;
import java.util.stream.Collectors;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
        System.out.println(friend(List.of("Peter", "Stephen", "Joe")));
    }

    public static List<String> friend(List<String> x) {
        return x.stream()
                .filter(i -> i.length() == 4)
                .collect(Collectors.toList());
    }
}
