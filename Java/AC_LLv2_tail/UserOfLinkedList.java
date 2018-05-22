/**
  Test the LinkedList class.

  Significant contributions by Michelle Tang and Michael Ye.
 */

public class UserOfLinkedList {
    public static void main(String[] commandLine) {

        String p;  /* A play-by-play message. Keep this id short
                      to promote visibility of assignments in the code */
        String expectation;

        // ------------------
        p= "empty list"; System.out.println( p);
        LinkedList cats = new LinkedList();
        printResults( cats);

        p= "add to the end of an empty list"; System.out.println( p);
        cats.add( "Armstrong");
        printResults( cats);

        // ------------------
        p= "add to the end of a non-empty list"; System.out.println( p);
        cats.add( "Fitzgerald");
        printResults( cats);

        // ------------------
        p= "add some more"; System.out.println( p);
        cats.add( "Peterson");
        cats.add( "Brown");
        cats.add( "Rich");
        printResults( cats);

        /*
         This test is important because the node at position 4 currently serves as the tail.
         Thus, this test must result in a change in tail from its previous Node (Rich) to Ellis.
        */
        p= "add at place"; System.out.println( p);
        cats.add(4, "Ellis");
        printResults( cats);

        /*
         This serves to check whether cats.add(4,"Ellis") properly changes the tail.
         If it does, then the list would go as "...ellis->james."
         If it doesn't, then the list would still have the value of the old tail,
         thus producing "...rich--> james."
        */
        cats.add(" James");
        printResults( cats);

        /*
         This test is needed because if the user chooses to remove the last node,
         then the tail would need to be changed accordingly.
        */
        p= "remove"; System.out.println(p);
        cats.remove(cats.size()-1);
        printResults( cats);
        // Check that tail was updated correctly, so that add() still works
        cats.add("Granz");
        printResults( cats);


        // // ------------------
        // p= ""; System.out.println( p);
        // printResults( cats);
    }


    /**
      Show the results
     */
    private static void printResults( LinkedList results) {
        System.out.println( "size: " + results.size());
        System.out.println( "list: " + results);
        System.out.println();
    }
}
