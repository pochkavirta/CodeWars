package Kyu7.Path2;

//TODO Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.
// Unfortunately for you, your drive is very bumpy! Given a string showing either flat road (_) or bumps (n). If you
// are able to reach home safely by encountering 15 bumps or less, return Woohoo!, otherwise return Car Dead

public class Task83 {
    public static void main(String[] args) {
        System.out.println(bumps("n"));
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn"));
        System.out.println(bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }

    public static String bumps(final String road) {
        return road.replace("_", "").length() <= 15 ? "Woohoo!" : "Car Dead";
    }
}
