package Kyu6;

//TODO You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too
// early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its
// citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of
// one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block
// for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function
// that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or
// late!) and will, of course, return you to your starting point. Return false otherwise.

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n'}));
        System.out.println(isValid(new char[]{'n', 's'}));
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'}));
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n'}));
        System.out.println(isValid(new char[]{'e', 'e', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}));
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'e', 'w', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}));
    }

    public static boolean isValid(char[] walk) {
        int ew = 0;
        int ns = 0;
        for (Character c : walk) {
            switch (c) {
                case 'e' -> ew++;
                case 'w' -> ew--;
                case 'n' -> ns++;
                case 's' -> ns--;
            }
        }
        return walk.length == 10 && ew == 0 && ns == 0;
    }
}
