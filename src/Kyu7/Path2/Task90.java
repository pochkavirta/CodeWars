package Kyu7.Path2;

//TODO You are given a dictionary-like object (implementation may vary by language) containing languages as keys and your
// corresponding test results as values. Return the list of languages where your score is at least 60, in descending order of the scores.
// Note: the scores will always be unique (so no duplicate values)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task90 {
    public static void main(String[] args) {
        System.out.println(myLanguages(Map.of("Java", 10, "Ruby", 80, "Python", 65)));
        System.out.println(myLanguages(Map.of("Hindi", 60, "Dutch", 93, "Greek", 71)));
        System.out.println(myLanguages(Map.of("C++", 50, "ASM", 10, "Haskell", 20)));
        System.out.println(myLanguages(Map.of("Danish", 100, "Polish", 90, "Chinese", 80)));
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet()
                .stream()
                .filter(me -> me.getValue() >= 60)
                .sorted((m1, m2) -> Integer.compare(m2.getValue(), m1.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<String> myLanguages1(final Map<String, Integer> results) {
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() >= 60) {
                result.add(entry.getValue() + entry.getKey());
            }
        }
        return result.stream()
                .sorted(Comparator.reverseOrder())
                .map(i -> i.replaceAll("\\d", ""))
                .toList();
    }
}

