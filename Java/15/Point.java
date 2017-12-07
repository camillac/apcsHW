public class Point {
    public double xcor;
    public double ycor;
    
    public double findManhattanDistance() {
        double distance = xcor + ycor;
        return distance;
    }

    // for testing
    public static void main(String[] args) {
        Point p0 = new Point();
        p0.xcor = 3.2;
        p0.ycor = 4.0;

        System.out.println( p0.xcor + ", " + p0.ycor);
        System.out.println( p0.findManhattanDistance());
        System.out.println( "---------------- \n");

        // another point
        Point p1 = new Point();
        p1.xcor = -1.5;
        p1.ycor = 4;

        System.out.println( p1.xcor + ", " + p1.ycor);
        System.out.println( p1.findManhattanDistance());
        System.out.println( "---------------- \n");
    }
}