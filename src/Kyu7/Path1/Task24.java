package Kyu7.Path1;

//TODO ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
// If the function is passed a valid PIN string, return true, else return false.

public class Task24 {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("000000"));
        System.out.println(validatePin("090909"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(".234"));
        System.out.println(validatePin("1"));
        System.out.println(validatePin("12"));
        System.out.println(validatePin("123"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1234567"));
        System.out.println(validatePin("-1234"));
        System.out.println(validatePin("1.234"));
        System.out.println(validatePin("1234.0"));
        System.out.println(validatePin("00000000"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}") || pin.matches("\\d{6}");
    }
}