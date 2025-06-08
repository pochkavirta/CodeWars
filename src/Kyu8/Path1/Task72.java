package Kyu8.Path1;

//TODO Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task72 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Hello Again"})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 3, 5, 7, 9})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Goodbye"})));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.iterate(0, i -> i + 2)
                .limit(arr.length - (arr.length / 2))
                .mapToObj(i -> arr[i])
                .toArray();
    }
}
