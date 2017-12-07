public class Playground {

    public static void main(String[] args) {
        
        /* mil is a class concept, since there can be only one
           Most Important Point. 
           So test before instantiating any Point.  */
        Point.milXcor = 1;
        Point.milYcor = 2;
        System.out.println( "mil: " + Point.describeMil());

        System.out.println( "\n----- 'fountain' test taken from spec --------");
        Point fountain = new Point();
        fountain.xcor = 3.2;  fountain.ycor = 5.0;

        System.out.println( fountain );
        System.out.println( fountain.milManhattanDistance()
                          + "  expecting 5.2"
                          );
                          
        System.out.println( "\n----- swings, in another quadrant --------");
        Point swings = new Point();
        swings.xcor = -1;   swings.ycor = -2;
        System.out.println( swings );
        System.out.println( swings.milManhattanDistance()
                          + "  expecting 6.0"
                          );

        System.out.println( "\n----- seesaw, in yet-another quadrant --------");
        Point seesaw = new Point();
        seesaw.xcor = -1;   seesaw.ycor = 2;
        System.out.println( seesaw );
        System.out.println( seesaw.milManhattanDistance()
                          + "  expecting 2.0"
                          );
    }
}