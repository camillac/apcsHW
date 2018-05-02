/**
  Test the LinkedList class.
 */

public class UserOfLinkedList {
    public static void main(String[] commandLine) {
        
        // list some cats
        LinkedList cats = new LinkedList();
        cats.add( "Armstrong");
        cats.add( "Fitzgerald");
        cats.add( "Peterson");
        cats.add( "Brown");
        cats.add( "Ellis");
        cats.add( "Rich");
        System.out.println( "list: " + cats);
        System.out.println();
        
        String p;  /* A play-by-play message. Keep this name short
                      to promote visibility of assignments in the code */


        // ------------------
        p= "minimal iteration";  System.out.println( p);
        cats.initIteration();
        try{
            while( true)  // idiom for "a loop that is terminated within"
                System.out.println( cats.nextElement());
        } catch( java.util.NoSuchElementException e) {
            goodCatch( e.getLocalizedMessage());
        }
        System.out.println();


        // ------------------
        p=   "Use hasNextElement to show the whole list "
           + "without raising NoSuchElementException";
        System.out.println( p);
		cats.initIteration();
        while (cats.hasNextElement()){
			System.out.println(cats.nextElement());
		}
			
        System.out.println();
    }


    /**
      Report that the appropriate exception was caught.
     */
    private static void goodCatch( String message) {
        System.out.print( "The expected exception was caught");
        if( message != null)
            System.out.print(
                ", bearing the message..." + System.lineSeparator()
              + message
              );
          System.out.println( System.lineSeparator()
            + "Continuing with this program...");
    }
}