public class Protagonist {
	
	// fields
	private String name;
	private int health;
	private int strength;
	private int defense;
	private double attackRate;
	
	// constructor
	public Protagonist(String n) {
		name = n;
		health = 125;
		strength = 100;
		defense = 40;
		attackRate = 0.4;
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
	
	public String getName() {
		return name;
	}
	
	
	// attacks
	public void lowerHP(int damage) {
		health -= damage;
	}
	
	public int attack( Monster x ) {
		int damage = (int) (strength * attackRate - x.getDefense());
		x.lowerHP(damage);
		return damage; // damage dealth to the monster
	}
	
	public void specialize() {
		defense -= 5;
		strength += 25;
	}
	
	public void normalize() {
		defense = 40;
		strength = 100;
	}
}
		
