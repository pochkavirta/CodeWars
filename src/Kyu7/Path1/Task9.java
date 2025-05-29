package Kyu7.Path1;

/*TODO accum("abcd") -> "A-Bb-Ccc-Dddd"
   accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
   accum("cwAt") -> "C-Ww-Aaa-Tttt" */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(accum("a"));
        System.out.println(accum("aB"));
        System.out.println(accum("AbC"));
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        var chars = s.split("");
        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));
    }
}
