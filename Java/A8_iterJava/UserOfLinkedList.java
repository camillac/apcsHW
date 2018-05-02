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
        
 
        try{
            while( true)  // idiom for "loop terminated within"
               System.out.println(cats.iterator().next());
        } catch( java.util.NoSuchElementException e) {
            goodCatch( e.getLocalizedMessage());
        }
        System.out.println();


        // ------------------
        p= "Use hasNext to stop before NoSuchElementException";
        System.out.println( p);
		while (cats.iterator().hasNext()) {
			System.out.println(cats.iterator().next());
		}
        System.out.println();


        // ------------------
        p= "Java's extended for-each should work!";
        System.out.println( p);
        // throw new java.lang.RuntimeException(
          // "Fix this.");
        System.out.println();


        // ------------------
        // p= "remove() is not implemented";  System.out.println( p);
        // try{
            // throw new java.lang.RuntimeException(
              // "invoke the iterator's remove() method.");
            // System.out.println( "Expecting to not see this message");
        // } catch( UnsupportedOperationException e) {
            // goodCatch( e.getLocalizedMessage());
        // }
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