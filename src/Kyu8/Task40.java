package Kyu8;

/*TODO You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
   a can contain numbers or strings. x can be either.
   Return true if the array contains the value, false if not.*/

import java.util.Arrays;

public class Task40 {
    public static void main(String[] args) {
        System.out.println(check(new Object[]{66, 101}, 66));
        System.out.println(check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(check(new Object[]{'t', 'e', 's', 't'}, 'e'));
        System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a)
                .anyMatch(i -> i == x);
    }
}
