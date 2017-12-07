public class Assassin extends Protagonist {
    public Assassin (String input) {
        name = input;
        health = 125;
        strength = 100;
        defense = initdefense = 40;
        attackRate = initattack = 0.8;
    }
    
    public String toString() {
        return "Assassin " + super.toString();
    }
}
