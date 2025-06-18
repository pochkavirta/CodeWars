package Kyu7.Path2;

//TODO Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.
// @ @@ @ @@ @ @@ @ @@ @ @@ @
// Implement a function returning the number of red beads.
// If there are less than 2 blue beads return 0.

public class Task81 {
    public static void main(String[] args) {
        System.out.println(countRedBeads(0));
        System.out.println(countRedBeads(1));
        System.out.println(countRedBeads(2));
        System.out.println(countRedBeads(3));
        System.out.println(countRedBeads(5));
    }

    public static int countRedBeads(final int nBlue) {
        int count = 0;
        for (int i = 1; i < nBlue; i++) {
            count += 2;
        }
        return count;
    }
}

