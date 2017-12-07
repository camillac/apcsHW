public class Point {
    public double xcor;
    public double ycor;
	public double milDis;
    
    public double findManhattanDistance() {
        double distance = xcor + ycor;
        return distance;
    }
	
	public String describeMil() {
		return "(" + xcor + ", " + ycor + ")";
    // for testing
	}
	
	public double milManhattanDistance() {
        double distance = xcor + ycor + milDis;
        return distance;
    }
}