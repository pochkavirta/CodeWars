package Kyu7.Path1;

//TODO Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
// For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
// The input will be a lowercase string with no spaces.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task55 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("abcdef")));
        System.out.println(Arrays.toString(capitalize("codewars")));
        System.out.println(Arrays.toString(capitalize("abracadabra")));
        System.out.println(Arrays.toString(capitalize("codewarriors")));
    }

    public static String[] capitalize(String s) {
        List<String> list = new ArrayList<>(List.of(s.split("")));
        List<String> list2 = new ArrayList<>(list.subList(0, list.size()));
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.set(i, list.get(i).toUpperCase());
            } else {
                list2.set(i, list.get(i).toUpperCase());
            }
        }
        return new String[]{String.join("", list), String.join("", list2)};
    }
}
