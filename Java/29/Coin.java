public class Coin {
    //Fields
    public String name;
    private int value;
    public double probabilityOfHeads;
    private String upFace;
    private int flips;
    private int heads;
    

    // To-String Template
	public String toString() {
		return "This " + name + " is worth " + value + " cent(s). Flipped "
		+ flips + " times, Heads: " + heads + " Tails: " + getTails() + " Face Up: " + upFace;
	}
	
	public int moneyValue(String type) {
		if (type == "penny")
			return 1;
		else if (type == "quarter")
			return 25;
		else if (type == "nickle")
			return 5;
		else if (type == "dime")
			return 10;
		else
			return 0;
	}
	
	public Coin(String type, double prob) {
		name = type;
		probabilityOfHeads = prob;
		value = moneyValue(type);
    }

    public Coin(String type, double prob, String up) {
		name = type;
		probabilityOfHeads = prob;
		upFace = up;
		value = moneyValue(type);
    }

	public void setUpFace(String up) {
		upFace = up;
	}
	
	public String flip() {
		if (Math.random() < probabilityOfHeads ) {
			upFace = "heads";
			flips += 1;
			heads += 1;
			return "heads";
		}
		else {
			upFace = "tails";
			flips += 1;
			return "tails";
		}
	}
	
	public boolean equals(Coin other) {
		return other.upFace.equals(upFace);
	}
	
    public int getFlips() {
		return flips;
    }

    public int getHeads() {
		return heads;
    }

    public int getTails() {
		return flips - heads;
	}

    public static void main(String[] arg) {
       
    }
}
