package Kyu7;

/* TODO Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount(""));
        System.out.println(getCount("pear tree"));
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
    }

    public static int getCount2(String str) {
        return str.replaceAll("[^aeiou]", "").length(); //регулярное выражение
    }

    public static int getCount(String str) {
        return (int) str.chars() //стрим
                .filter(i -> "aeiou".indexOf(i) != -1)
                .count();
    }
}
