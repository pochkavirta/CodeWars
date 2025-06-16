package Kyu7.Path1;

//TODO Complete the function/method so that it returns the url with anything after the anchor (#) removed.

public class Task44 {
    public static void main(String[] args) {
        System.out.println(removeUrlAnchor("www.codewars.com#about"));
        System.out.println(removeUrlAnchor("www.codewars.com?page=1"));
    }

    public static String removeUrlAnchor(String url) {
        return url.split("#")[0];
    }

    public static String removeUrlAnchor1(String url) {
        if (!url.contains("#")) {
            return url;
        }
        return url.substring(0, url.indexOf("#"));
    }
}
