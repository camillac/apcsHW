public class Playground {

	
	public static void main(String[] args) {
		Point mil = new Point();
        mil.xcor = 12.3;
        mil.ycor = -45.67;
		
		System.out.println( mil.describeMil());
		
		// another point
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
		
		// another point
        Point p2 = new Point();
        p2.xcor = 1.5;
        p2.ycor = -4;

        System.out.println( p2.xcor + ", " + p2.ycor);
        System.out.println( p2.findManhattanDistance());
        System.out.println( "---------------- \n");
		
		Point fountain = new Point();
		fountain.xcor = -8.0;
		fountain.ycor = -7.5;
		fountain.milDis = mil.findManhattanDistance();
		System.out.println( fountain.milManhattanDistance());
    }
}