/** 
  sort an array using merge sort / sub-sort-then-merge sort / submerge sort
 */
public class SubSortThenMerge_Sorter extends Sorter {

    /** 
      construct an instance
     */
    public SubSortThenMerge_Sorter( Comparable[] usersData) {
        super( usersData);
    }
    
    
    /** 
      selection sort
     */
    public void sort() {
        // soon
    }
    
    
   /** 
      Merge two ordered sub-lists.
      The sublists are adjacent portions of the @elements field of this object,
      identified by... 
         @aBeginAt    the index into @elements of the first element in
                      the first list to be merged

         @bBeginAt    like aBeginAt, but for the second list to be merged
                      Since the sublists are adjacent, this is also 
                      the index into @elements that is one greater than
                      the index of the last element in the first list to be merged.

         @endBefore   the index into @elements that is one greater than
                      the index of the last element in the second list to be merged

         @precondition: sub-lists are sorted in ascending order

      The merged version replaces the sublists in @elements.

      Based on work in 79_merge/
      
      This merge method should be private, but I'm starting it as public
      so that it is convenient to test from UserOfSorts.java.
     */
    public void merge( int aBeginAt
                     , int bBeginAt
                     , int endBefore
                     ) {
        // temporary storage for the merged list                         
		Comparable[] result = new Comparable[endBefore];
        int aIndex = aBeginAt;
        int bIndex = bBeginAt;
        for(int x = 0; x < endBefore; x++){
          if (elements[aIndex].compareTo(elements[bIndex]) > 0)
                result[x] = elements[bIndex++];
          else  
                result[x] = elements[aIndex++];   
        }
        elements = result;
    }
}