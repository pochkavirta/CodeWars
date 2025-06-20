package Kyu7.Path2;

//TODO Write a function that accepts fight string consists of only small letters and return who wins the fight. When the
// left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

public class Task88 {
    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }

    public static String alphabetWar(String fight) {
        int leftSide = 0;
        int rightSide = 0;
        for (String s : fight.split("")) {
            switch (s) {
                case "w" -> leftSide += 4;
                case "p" -> leftSide += 3;
                case "b" -> leftSide += 2;
                case "s" -> leftSide += 1;
                case "m" -> rightSide += 4;
                case "q" -> rightSide += 3;
                case "d" -> rightSide += 2;
                case "z" -> rightSide += 1;
                default -> leftSide += 0;
            }
        }
        return leftSide > rightSide ? "Left side wins!"
                : leftSide < rightSide ? "Right side wins!"
                : "Let's fight again!";
    }
}
