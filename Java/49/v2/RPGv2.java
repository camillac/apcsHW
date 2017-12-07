public class RPGv2 {
	
	public static void main( String[] args) {
		// int numOfChars = 6;
		// Character[] agents = new Character[numOfChars];
		
		/* PART 2 OF HW ------------------------------------
			Prediction: Compile
				Actual: Execute
				Error Message: "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3"
				
			------------------------------------------------
		*/
		int numOfChars = 3;
		Character[] agents = new Character[numOfChars];
		
		String name = "Camilla";
		
		// Protags
		// agents[0] = new Warrior(name);
		// agents[1] = new Tank(name);
		// agents[2] = new Assassin(name);
		// Monsters
		agents[0] = new Dragon();
		agents[1] = new Goblin();
		agents[2] = new Cyclops();
	
		// testing toString of each agent
		for (int i = 0; i < numOfChars; i++) {
			System.out.println(agents[i]);
		}
		
		// testing getName for Monsters
		/* PART 3 OF HW	------------------------------------
			Prediction: Compile
				Actual: Compile
				Error Message: " error: cannot find symbol
								System.out.println(agents[i].getName());"
								
			------------------------------------------------
		*/
		for (int i = 0; i < numOfChars; i++) {
			System.out.println(agents[i].getName());
		}
		
	}
}
		
	