public class Tank extends Protagonist {
    public Tank (String input) {
      name = input;
      health = 125;
      strength = 100;
      defense = initdefense = 80;
      attackRate = initattack = 0.4;
    }
    
    public String toString() {
        return "Tank " + super.toString();
    }
}
