package Kyu7.Path2;

//TODO Create a function that returns the name of the winner in a fight between two fighters.
// Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
// Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
// Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
// Your function also receives a third argument, a string, with the name of the fighter that attacks first.

public class Task67 {
    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harald"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald"));
    }

    public static String declareWinner1(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return firstAttacker;
                }
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return firstAttacker;
                }
                firstAttacker = fighter1.name;
            }
        }
        return "";
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return String.format("%s attacks %s; %s now has %d health and is dead. %s wins.%n",
                            firstAttacker, fighter2.name, fighter2.name, fighter2.health, firstAttacker);
                }
                System.out.printf("%s attacks %s; %s now has %d health.%n", firstAttacker, fighter2.name, fighter2.name, fighter2.health);
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return String.format("%s attacks %s; %s now has %d health and is dead. %s wins.%n",
                            firstAttacker, fighter2.name, fighter2.name, fighter2.health, firstAttacker);
                }
                System.out.printf("%s attacks %s; %s now has %d health.%n", firstAttacker, fighter1.name, fighter1.name, fighter1.health);
                firstAttacker = fighter1.name;
            }
        }
        return "";
    }
}
