package Kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task25 {
    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
        System.out.println(findNeedle(new Object[]{"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"}));
        System.out.println(findNeedle(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54}));
        System.out.println(findNeedle(new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }

    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle"); //List
    }

    public static String findNeedle2(Object[] haystack) {
        return IntStream.range(0, haystack.length) //стрим
                .filter(i -> "needle".equals(haystack[i]))
                .mapToObj(i -> "found the needle at position " + i)
                .findFirst()
                .orElse("needle not found");
    }
}
