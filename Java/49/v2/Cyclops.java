public class Cyclops extends Monster {
    //constructor
    public Cyclops() {
	health = 300;
	strength = (int) (Math.random() * 45 + 20);
	defense = 20;
	attackRate = 0.8;
    }
	
    public String toString() {
	    return "Cyclops " + super.toString();
    }
}
