/** 
 * Test SuperArray features for implementing a list
 */

public class UserOfSuperArray {

    public static void main( String[] args ) {
        SuperArray list = new SuperArray();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list:" + list);

        /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
        */
        int i = 0;
        for( ; i < 5; i++ ) {
            list.add( -i); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list);
        
        // Add enough elements that expansion is expected
        for( ; i < 15; i++ ) {
            
            if( i == 10) System.out.println( "expansion expected");
            
            list.add( -i);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list);
        
        // Trust no one.
        for( ; i < 35; i++ ) 
            list.add( -i);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list);
        
        
        // test accessor
        System.out.println( "sample elements from SuperArray:");
        for( i = 1; i < list.size(); i *= 2 ) {
            System.out.println( "element " + i + ": "
                              + list.get( i)
                              );
        }
        
        // test set
        i = 8;  // element to be modified
        System.out.println( "changed element " + i + " from "
                          + list.set( i, i + 1000) + " to "
                          + list.get( i)
                          );
        i = 16;  // element to be modified
        System.out.println( "changed element " + i + " from "
                          + list.set( i, i + 1000) + " to "
                          + list.get( i)
                          );
    }
}
