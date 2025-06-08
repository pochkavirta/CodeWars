package Kyu8.Path1;

//TODO This function should test if the factor is a factor of base.
// Return true if it is a factor or false if it is not.

public class Task78 {
    public static void main(String[] args) {
        System.out.println(checkForFactor(10, 2));
        System.out.println(checkForFactor(63, 7));
        System.out.println(checkForFactor(2450, 5));
        System.out.println(checkForFactor(24612, 3));
    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
