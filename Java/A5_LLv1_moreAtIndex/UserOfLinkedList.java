/**
  Test the LinkedList class.
 */

public class UserOfLinkedList {
    public static void main(String[] commandLine) {
        LinkedList fruits = new LinkedList();

        // test exception-raising for out-of-bounds  get()
        System.out.println( "test get( out-of-bounds)");
        try{
            System.out.println( fruits.get( -11)
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }

        try{
            System.out.println( fruits.get( fruits.size())
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }
        System.out.println();


        // test exception-raising for out-of-bounds  set()
        System.out.println( "test set( out-of-bounds)");
        try{
            System.out.println(
              fruits.set( -13, "fail!")
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }

        try{
            System.out.println(
              fruits.set( fruits.size()+ 3, "fail!")
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }
        System.out.println();


        // test add( 0... on an empty list
        System.out.println( "test add( 0... on an empty list");
        fruits.add( 0, "persimmon");
        System.out.println( "expecting persimmon: "
                           + fruits);
        System.out.println();

        // test add( 0... on a populated list
        System.out.println( "test add( 0... on a populated list");
        fruits.add( 0, "plantain");
        System.out.println( "expecting plantain,persimmon: "
                          + fruits);
        System.out.println();

        // test add at end using index
        System.out.println( "test add at end using index ");
        fruits.add( fruits.size(), "pepper");
        System.out.println( "expecting plantain,persimmon,pepper: "
                          + fruits);
        System.out.println();


        // test add in interior
        System.out.println( "test add in interior");
        fruits.add( 1, "crabapple");
        System.out.println(
            "expecting plantain,crabapple,persimmon,pepper: "
          + fruits);
        System.out.println();

        // test add out-of-bounds
        System.out.println( "test add out-of-bounds)");
        try{  // negative index
            fruits.add( -17, "of loom");
            System.out.println(
                " Expecting IndexOutOfBoundsException, "
              + "not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }

        try{  // too-large index
            fruits.add( fruits.size() +1, "of loom");
            System.out.println(
                " Expecting IndexOutOfBoundsException, "
              + "not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }
        System.out.println();


        // // re-test set and get, since I re-factored my code
        // System.out.println(
          // "re-test set() and get(), since I re-factored my code");
        // System.out.println( fruits.set( 0, "PLANTAIN") + " expecting plantain");
        // System.out.println( fruits.get( 0) + " expecting PLANTAIN");
        // System.out.println( fruits.set( fruits.size()-1, "PEPPER")
                          // + " expecting pepper");
        // System.out.println( fruits.get( fruits.size()-1)
                          // + " expecting PEPPER");
        // System.out.println();


        // test remove( 0)
        System.out.println( "test remove( 0)");
        System.out.println( fruits.remove( 0) + " expecting PLANTAIN");
        System.out.println(
            "expecting crabapple,persimmon,PEPPER: "
          + fruits);
        System.out.println();

        // test removing interior element
        System.out.println( "test removing interior element");
        System.out.println( fruits.remove( 1) + " expecting persimmon");
        System.out.println(
            "expecting crabapple,PEPPER: "
          + fruits);
        System.out.println();
		
		// test removing last element
        System.out.println( "test removing interior element");
        System.out.println( fruits.remove( fruits.size()) + " expecting persimmon");
        System.out.println(
            "expecting crabapple: "
          + fruits);
        System.out.println();


        // test removing out-of-bounds
        System.out.println( "test remove out-of-bounds");
        try{  // negative index
            System.out.println( fruits.remove( -21)
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }

        try{  // too-large index
            System.out.println( fruits.remove( fruits.size() +7)
              + " Expecting IndexOutOfBoundsException,"
              + " not this message.");
        } catch( IndexOutOfBoundsException ioobe) {
            goodCatch( ioobe.getLocalizedMessage());
        }
        System.out.println();
    }


    /**
      Report that the appropriate exception was caught.
     */
    private static void goodCatch( String message) {
        System.out.println(
            "The expected exception was caught, "
          + "bearing the message..."    + System.lineSeparator()
          + message                     + System.lineSeparator()
          + "Continuing with this program..."
          );
    }
}
