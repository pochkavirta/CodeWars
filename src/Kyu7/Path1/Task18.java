package Kyu7.Path1;

//TODO Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
// Square all numbers k (0 <= k <= n) between 0 and n.
// Count the numbers of digits d used in the writing of all the k**2.
// Implement the function taking n and d as parameters and returning this count.

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
        System.out.println(nbDig(11011, 2));
        System.out.println(nbDig(12224, 8));
        System.out.println(nbDig(11549, 1));
    }

    public static int nbDig(int n, int d) {
        AtomicInteger count = new AtomicInteger(0);
        IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .forEach(i -> count.getAndAdd(i.length() - i.replace(String.valueOf(d), "").length()));
        return count.get();
    }
}
