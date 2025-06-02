package Kyu7;

//TODO Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string (alphabetical
// ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }

    public static String longest(String s1, String s2) {
        return Arrays.stream(s1.concat(s2).split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
