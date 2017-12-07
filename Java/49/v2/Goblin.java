public class Goblin extends Monster {
    //constructor
    public Goblin() {
	health = 250;
	strength = (int) (Math.random() * 45 + 20);
	defense = 20;
	attackRate = 1;
    }
    public String toString() {
	    return "Goblin" + super.toString();
    }
}
