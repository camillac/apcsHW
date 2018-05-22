/**
  Test the Queue_hasA_LinkedList implementation of a queue.
 */

public class UserOfQueue {
    public static void main(String[] commandLine) {
        
        String p;  /* A play-by-play message. Keep this id short
                      to promote visibility of assignments in the code */


        // ------------------
        p= "constructor and toString"; System.out.println( p);
        Queue q = new Queue_hasA_LinkedList();
        System.out.println( "queue: " + q);
        System.out.println();


        // ------------------
        p= "enqueue first"; System.out.println( p);
        q.enqueue( "alpha");
        System.out.println( "queue: " + q);
        System.out.println();


        // ------------------
        p= "enqueue more"; System.out.println( p);
        q.enqueue( "bravo");
        q.enqueue( "charlie");
        q.enqueue( "delta");
        System.out.println( "queue: " + q);
        System.out.println();


        // ------------------
        p= "dequeue all"; System.out.println( p);
        while( !q.isEmpty()) {
            System.out.println( "at front: " + q.peek());
            System.out.println( "from queue: " + q.dequeue());
            System.out.println( "remaining queue: " + q);
        }
        System.out.println();


        // ------------------
        p= "peek attempt at empty queue should throw error";
        System.out.println( p);
        try{
            System.out.println( q.peek() +
                                "Expecting to not see this message");
        } catch( java.util.NoSuchElementException e) {
            goodCatch( e.getLocalizedMessage());
        }
        System.out.println();



        // ------------------
        p= "dequeue attempt from an empty queue should throw error"; 
        System.out.println( p);
        try{
            System.out.println( q.dequeue() +
                                "Expecting to not see this message");
        } catch( java.util.NoSuchElementException e) {
            goodCatch( e.getLocalizedMessage());
        }
        System.out.println();


        // // ------------------
        // p= "template for more tests"; System.out.println( p);
        
        // System.out.println( "queue: " + q);
        // System.out.println();
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
