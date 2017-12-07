public class Point {
    public double xcor;
    public double ycor;
	public double meow;
    public double findManhattanDistance() {
        double distance = xcor + ycor;
        return distance;
    }

    // Most Important Location
    public static double milXcor;
    public static double milYcor;

    // commented out by Holmes, who sees no point to this, as it were: 
    // public static Point object;

    public static String describeMil() {
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

    public String toString() {
        return xcor + ", " + ycor + "     " + milXcor + ", " + milYcor;
    }


    // no-arg constructor
    public Point() {
        xcor = 5; ycor = 7.3;
    }

    // overloaded constructor
    public Point( double xDisp, double yDisp) {
        xcor = milXcor + xDisp; ycor = milYcor + yDisp;
    }

    // reflect
    public Point( Point existing) {
        xcor = existing.ycor; ycor = existing.xcor;
    }

	//public boolean .equals() {}
	
    public static void main(String[] args) {
        milXcor = 2.2; milYcor = 4.7;

        //tests for displacement constructor
        Point p0 = new Point(1.0, 5.0);
        Point p1 = new Point(1.0, 5.0);
		p0.meow = 2.0;
		System.out.println(p0.equals(p1));
		System.out.println(p0.xcor == p1.xcor);
		System.out.println(p0.ycor == p1.ycor);

		
    }
}