package Kyu8;

/*TODO Write function bmi that calculates body mass index (bmi = weight / height2).
   if bmi <= 18.5 return "Underweight"
   if bmi <= 25.0 return "Normal"
   if bmi <= 30.0 return "Overweight"
   if bmi > 30 return "Obese"*/

public class Task43 {
    public static void main(String[] args) {
        System.out.println(bmi(50, 1.80));
        System.out.println(bmi(80, 1.80));
        System.out.println(bmi(90, 1.80));
        System.out.println(bmi(100, 1.80));
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi <= 18.5 ? "Underweight" :
                bmi <= 25.0 ? "Normal" :
                        bmi <= 30.0 ? "Overweight" :
                                "Obese";
    }
}
