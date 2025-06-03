package Kyu7;

//TODO In a small town the population is p0 = 1000 at the beginning of a year. The population regularly
// increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
// How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?

public class Task26 {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        while (p0 < p) {
            p0 += (int) (p0 * (0.01 * percent) + aug);
            count++;
        }
        return count;
    }
}
