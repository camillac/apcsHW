/**
  Test the LinkedList class.
 */

public class UserOfLinkedList {
    public static void main(String[] commandLine) {
        System.out.println( "test constructor and toString");
        LinkedList fruits = new LinkedList();
        System.out.println( fruits);
        System.out.println();
        
        // initial test of size()
        System.out.println( "test size() on an empty list");
        System.out.println( "size: " + fruits.size() + " expecting 0"  );
        System.out.println();
        
        // test add() and size()
        System.out.println( "test add(),  and size() on a non-empty list");
        System.out.println( fruits.add( "mango") + " expecting true"  );
        System.out.println( "size: " + fruits.size() + " expecting 1"  );
        System.out.println( fruits);
        System.out.println();
        
        System.out.println( fruits.add( "kiwi") + " expecting true"  );
        System.out.println( "size: " + fruits.size() + " expecting 2"  );
        System.out.println( fruits);
        System.out.println();
        
        // test get()
        System.out.println( "test get()");
        System.out.println( fruits.get( 0) + " expecting mango");
        System.out.println( fruits.get( 1) + " expecting kiwi");
        System.out.println();
        
        // test set()
        System.out.println( "test set()");
        System.out.println( fruits.set( 0, "MANGO") + " expecting mango");
        System.out.println( fruits.get( 0) + " expecting MANGO");
        System.out.println( fruits.set( 1, "KIWI") + " expecting kiwi");
        System.out.println( fruits.get( 1) + " expecting KIWI");
        System.out.println();
    }
}
