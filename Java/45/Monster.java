public class Monster {
	
	// fields
	private int health;
	private int strength;
	private int defense;
	private double attackRate;
	
	// constructor
	public Monster() {
		health = 150;
		strength = (int) (Math.random() * 45 + 20);
		defense = 20;
		attackRate = 1;
	}
	
	public boolean isAlive() {
		if (health <= 0)
			return false; // meaning dead
		else
			return true; // meaning alive
	}
	
	
	// getters
	public int getDefense() {
		return defense;
	}
	
	
	// attacks
	public void lowerHP(int damage) {
		health -= damage;
	}
	
	public int attack( Protagonist n ) {
		int damage = (int) (strength * attackRate - n.getDefense());
		n.lowerHP(damage);
		return damage; // damage dealth to the protag
	}
}
