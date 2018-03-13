/** 
  test a merge operation in the Sorts class
 */

public class UserOfSorts {
     public static void main(String[] commandLine) {
         
        // Why should you comment out this first attempt at a test?
        // You need a deeper answer than "because it causes an error".
        // oneTest( "array of int, rather than Integer"
               // , new int[]{0,2,4,}
               // , new int[]{1,2,3,3,5,7,9,}
               // );
        
        oneTest( "first array is shorter"
               , new Integer[]{0,2,4,}
               , new Integer[]{1,2,3,3,5,7,9,}
               );
        
        oneTest( "second array is shorter"
               , new Integer[]{1,2,3,3,5,7,9,}
               , new Integer[]{0,2,4,}
               );
    }


    /** 
     Run one test
     */
    private static void oneTest( String desc
                               , Comparable[] a, Comparable[] b) {
        System.out.println( System.lineSeparator() + desc);
        Sorts merged = new Sorts( a, b);
        System.out.println( merged);
        System.out.println( "sorted: " + merged.isSorted());
     }
}
