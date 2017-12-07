public class Point {
    // fields
           public double xcor;
		   public double ycor;
		   private double limit;
		   
    
    // constructor
    public Point( double xcor, double ycor) {
        xcor = xcor;
		ycor = ycor;
    }

    // methods to implement the neighborhood
    public void setAdjoinLimit( double radius) {
        /*  Cause this point to remember the limit of how
            far away another can be and still be considered
            "in the neighborhood"
        */
        limit = radius;
    }
    
    public double getAdjoinLimit() {
        /* Convey the current limit of the neighborhood
        */
        return limit;
    }
    
    public boolean adjoins( Point other) {
        /* Convey the true/false value of the boolean statement
           "The other point is within this point's neighborhood,
            measured by Euclidean distance."
        */
		double distance = Math.sqrt(Math.pow(other.xcor + xcor, 2) - Math.pow(ycor + other.ycor, 2));
        return distance <= getAdjoinLimit();
    }
}