public class Character {
	
	// fields
	protected int health;
	protected int strength;
	protected int defense;
	protected double attackRate;
	
	
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
	
	public int attack( Character c ) {
		int damage = (int) (strength * attackRate - c.getDefense());
		c.lowerHP(damage);
		return damage; // damage dealth to the other character
	}
}
