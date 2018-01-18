/******************************************************************************
 * Represent a biased coin
 * based on work by Alexander Radu, Dylan Mak, Reed Scheinberg
 ******************************************************************************/

public class Coin implements Comparable{

    private String name;
    private double value;
    private double probabilityOfHeads;
    private String upFace;
    private int    flips;
    private int    heads;

    /** 
      @return an idiosyncratic definition of comparison:
           same face up => equal
           otherwise, higher-valued Coin is greater.
     */
    // Write compareTo


    // ------- previously-tested code below here -------

    public Coin( String name, double probabilityOfHeads) {
        this( name, probabilityOfHeads, "tails");
    }

    public Coin( String name, double probabilityOfHeads, String upFace) {
        this.name = name;
        this.probabilityOfHeads = probabilityOfHeads;
        valueGen();
        setUpFace( upFace);
    }

    private void valueGen() {
        if (name.equals("quarter"))
            value = 0.25;
        else if (name.equals("dime"))
            value = 0.10;
        else if (name.equals("nickel"))
            value = 0.05;
        else if (name.equals("penny"))
            value = 0.01;
        else
            value = 0.00;
    }

    public String toString() {
        return "a " + name 
             + ", value " + value
             + ", showing " + upFace
             + ", head-biased " + probabilityOfHeads
             + ", flipped " + flips + " times"
             + ", landed heads-up " + heads + " times"
             ;
    }

    public void setUpFace(String upFace) {
        if ( upFace.equals("tails") || upFace.equals("heads"))
            this.upFace = upFace;
        else System.out.println( "invalid face: " + upFace);
    }

    public void flip() {
        flips = flips + 1;
        if (Math.random() < probabilityOfHeads) {
            upFace = "heads";
            heads = heads + 1;
        }
        else {
            upFace = "tails";
        }
    }

    public boolean equals( Coin other) {
        return upFace.equals( other.upFace);
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
    
    public double flip( int times) {
        int ctr = 0;
        while (ctr < times) {
            flip();
            ctr += 1;
            }
        return (double)heads / flips;
    }
	
	// added for hw62
	public static void main(String[] args) {
	}
	
	public int compareTo(Object o) {
		if (o instanceof Coin) {
			Coin x = (Coin) o;
			if (upFace.equals(x.upFace))
				return 0;
			else if (!(upFace.equals(x.upFace)) && upFace.equals("heads"))
				return 1;
			else
				return -1;
		}
		else
			return -2;
	}
		
}