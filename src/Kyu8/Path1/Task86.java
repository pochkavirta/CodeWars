package Kyu8.Path1;

//TODO Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
// When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
// Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
// S is misinterpreted as 5
// O is misinterpreted as 0
// I is misinterpreted as 1
// The test cases contain numbers only by mistake.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task86 {
    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
    }

    public static String correct(String string) {
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public static String correct2(String string) {
        return Arrays.stream(string.split(""))
                .map(i -> switch (i) {
                    case "0" -> "O";
                    case "1" -> "I";
                    case "5" -> "S";
                    default -> i;
                })
                .collect(Collectors.joining());
    }
}
