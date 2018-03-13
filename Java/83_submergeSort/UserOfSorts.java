/** 
  test merge sort aka sub-sort-then-merge sort aka submerge sort
 */

public class UserOfSorts {
    public static void main(String[] commandLine) {
                            // indexes:  0  1   2 3 4   5 6 7 8 9 0  1
        Integer[] source = new Integer[]{-1,-1, 1,3,5,  2,4,5,7,8,9, -1,};
        oneMerge( "merge the positive numbers"
               , new SubSortThenMerge_Sorter( source)
               , 2, 5, 10
               );


       // arrays to be sorted
        Integer[] numbers = new Integer[] {17,5,5,11,3,2,};
        String[] letters =  new String[]
                   { "c","g","j","m","d","b","e","p","a",};

        oneSort( "sub-sort-then-merge sort on numbers"
               , new SubSortThenMerge_Sorter( numbers)
               );
        oneSort( "sub-sort-then-merge sort on letters"
               , new SubSortThenMerge_Sorter( letters)
               );
    }


    /** 
     Run one MERGE test
     */
    private static void oneMerge( String desc
                                , SubSortThenMerge_Sorter merger
                                , int aBeginAt
                                , int bBeginAt
                                , int endBefore
                                ) {
        System.out.println( System.lineSeparator() + desc);
        merger.merge( aBeginAt, bBeginAt, endBefore);;
        System.out.println( merger);
     }


    /** 
     Run one SORT test
     */
    private static void oneSort( String description
                               , Sorter sorter
                               ) {
        System.out.println( System.lineSeparator() + description);
        sorter.sort();
        System.out.println( sorter);
        System.out.println( "sorted: " + sorter.isSorted());
     }
}
