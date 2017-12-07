public class Monster extends Character {
	
	// constructor
	public Monster() {
		health = 150;
		strength = (int) (Math.random() * 45 + 20);
		defense = 20;
		attackRate = 1;
	}
	
}
