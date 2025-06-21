package Kyu7.Path2;

//TODO Given a string made up of letters a, b, and/or c, switch the position of letters a and b
// (change a to b and vice versa). Leave any incidence of c untouched.
// 'acb' --> 'bca'
// 'aabacbaa' --> 'bbabcabb'

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task94 {
    public static void main(String[] args) {
        System.out.println(switcheroo("acb"));
        System.out.println(switcheroo("aabacbaa"));
    }

    public static String switcheroo(String x) {
        return x.replace('a', '_')
                .replace('b', 'a')
                .replace('_', 'b');
    }

    public static String switcheroo1(String x) {
        return Arrays.stream(x.split(""))
                .map(i -> "a".matches(i) ? "b"
                        : "b".matches(i) ? "a"
                        : "c")
                .collect(Collectors.joining());
    }
}
