public class Point {
    public double xcor;
    public double ycor;
    public double findManhattanDistance() {
        double distance = xcor + ycor;
        return distance;
    }

    // Most Important Location
    public static double milXcor;
    public static double milYcor;
	
	public String toString() {
		return "Point Coords: (" + xcor + ", " + ycor + ")\nMil Coords: (" + milXcor + ", " + milYcor + ")";
	}
 
    public static String
    describeMil() {
        return "(" + milXcor + "," + milYcor + ")";
    }
 
    public
    /* pertains to each instance, so no "static"  */
    double
    milManhattanDistance() {
        double distance = Math.abs( xcor - milXcor) +
                          Math.abs( ycor - milYcor);
        return distance;
    }
	
	
	
	public static void main(String[] args) {
		Point swings = new Point();
        swings.xcor = -1;   swings.ycor = -2;
        System.out.println(swings);
		System.out.println(" " + swings);
        System.out.println(swings.toString());
		
						  

    // testing code removed. In practice, I would definitely
    // leave it for future use. For this demo, removing it
    // shortens the listing, improving legibility.
	}
}