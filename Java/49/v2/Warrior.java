public class Warrior extends Protagonist {
    public Warrior (String input) {
      name = input;
      health = 200;
      strength = 100;
      defense = initdefense = 40;
      attackRate = initattack = 0.4;
    }
    
    public String toString() {
        return "Warrior " + super.toString();
    }
}
