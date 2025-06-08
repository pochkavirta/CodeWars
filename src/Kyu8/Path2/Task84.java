package Kyu8.Path2;

//TODO The function is not returning the correct values. Can you figure out why?

public class Task84 {
    public static void main(String[] args) {
        System.out.println(getPlanetName(2));
        System.out.println(getPlanetName(5));
        System.out.println(getPlanetName(3));
    }

    static String getPlanetName(int id) {
        return switch (id) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> null;
        };
    }
}
