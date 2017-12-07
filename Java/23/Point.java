public class Point {
    // fields
           public double xcor;
		   public double ycor;
		   public double lim;
		   private double xlim;
		   private double ylim;
    
	public Point(double x, double y) {
		xcor = x;
		ycor = y;
	}

    public void setAdjoinLimit( double xaxisLimit, double yaxisLimit) {
        /*  Cause this point to remember the EXTENTS ALONG 2 AXES of how
            far away another Point can be, while still being considered
            "in the neighborhood" of this Point.
        */
        
        xlim = xaxisLimit;
		ylim = yaxisLimit;
    }
    
    public double getXaxisAdjoinLimit() {
        /* Convey the current extent of the neighborhood ALONG THE x AXIS
        */
        
        return xlim;
    }
    
    public double getYaxisAdjoinLimit() {
        /* Convey the current extent of the neighborhood ALONG THE y AXIS
        */
        
        return ylim;
    }
	
	public double getAdjoinLimit() {
		
		return lim;
	}
    
    public boolean adjoins( Point other) {
        /* Convey the true/false value of the boolean statement
           "The other Point is within this Point's neighborhood,
            IN TWO DIMENSIONS."
        */
        
        return (Math.sqrt(Math.pow((xcor - other.xcor), 2) + Math.pow((ycor - other.ycor), 2)) <= lim);
    }
	
	public boolean ADJOINS( Point other) {
		
		return (Math.abs(xcor - other.xcor)) <= xlim
		&& (Math.abs(ycor - other.ycor)) <= ylim;
		
	}
	
}