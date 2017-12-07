public class Protagonist extends Character {
	
	private String name;
	
	// constructor
	public Protagonist(String n) {
		name = n;
		health = 125;
		strength = 100;
		defense = 40;
		attackRate = 0.4;
	}
	
	// getter
	public String getName() {
		return name;
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
		
