package Kyu8.Path1;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feeney"));
    }

    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.lastIndexOf(' ') + 1)).toUpperCase();
    }
}
