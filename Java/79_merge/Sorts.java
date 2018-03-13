/** 
  Implementations of sorting an array  
 */

public class Sorts {

    private Comparable[] data;  // avoid changing the user's data
    public final static int SELECTION_METHOD = 0;
    public final static int INSERTION_METHOD = 1;

    // bubble sort variants
    public final static int BUBBLE_LARGE_METHOD      = 2; // common 2018-02-09
    public final static int BUBBLE_SMALL_METHOD      = 3; // recommended 2018-02-10
    public final static int BUBBLE_EARLY_EXIT_METHOD = 4;
    public final static int BUBBLE_DO_WHILE_METHOD   = 5;

    /** 
      construct an instance from 2 already-sorted arrays

      @precondition: @a and @b are sorted in ascending order
     */
    public Sorts( Comparable[] a, Comparable[] b) {
        data = new Comparable[0];  // fix the size

        // programmed using recursion, because practice
        merge( 0, a, 0, b, 0);
        
    }


    /** 
      Merge @a and @b into @data,
      starting at indexes @aNext, @bNext, and @dataEnd, respectively.
      
      @precondition: @a and @b are sorted in ascending order
     */
    private void merge( int dataEnd
                      , Comparable[] a, int aNext
                      , Comparable[] b, int bNext) {
        // decision: base or recursive case?
		System.out.println((a[aNext] == null || b[bNext] == null));
		if (aNext > a.length - 1 || bNext > b.length - 1){
				
        // solution for base case
			if (b[bNext] == null) {
				//Sorts.append(dataEnd, a, aNext);
				while( aNext < a.length)
					data[ dataEnd++] = a[ aNext++];
			}
			else
				//Sorts.append(dataEnd, b, bNext);
				while( bNext < b.length)
					data[ dataEnd++] = b[ bNext++];
		}
				
        // solution for recursive case
		else {
			System.out.println(a[aNext].compareTo(b[bNext]) <= 0);
			if (a[aNext].compareTo(b[bNext]) <= 0) {
				System.out.println(a[aNext].compareTo(b[bNext]) <= 0);
				System.out.println(a[aNext]);
				System.out.println(data[dataEnd]);
				data[dataEnd] = a[aNext];
				System.out.println(a[aNext]);
				aNext++;
			}
			
			else {
				data[dataEnd] = b[bNext];
				bNext++;
			}
			dataEnd++;
			merge(dataEnd, a, aNext, b, bNext);
		}
            // combining function
            // handle the part that the recursive abstraction does not handle
            // recursive abstraction
    }


    /** 
      Append the remainder of @suffix to @data, beginning at @dataEnd.
      "Remainder" means "any elements of @suffix from index @startAt onwards".
     */
    private void append( int dataEnd, Comparable[] suffix, int startAt) {
        while( startAt < suffix.length)
            data[ dataEnd++] = suffix[ startAt++];
    }


// ------ code already tested in previous sorting assignments ------
    /** 
      construct an instance by copying an unsorted array
     */
    public Sorts( Comparable[] usersData) {
        data = new Comparable[ usersData.length];
        for( int i = 0; i < usersData.length; i++)
            data[i] = usersData[i];
    }
    
    
    /** 
      @return a string representation of the data
     */
    public String toString() {
        String result = "[";
        for( Comparable d : data)
            result += d + ",";
        return result + "]";
    }


    /** 
      @return the boolean value of the statement
         "the data is in ascending order"
     */
    public boolean isSorted() {
        for( int i = 0
           ; i < data.length-1 // stop early, because comparing to next
           ; i++
           )
            if( data[i].compareTo( data[ i+1]) > 0) return false;
        return true;
    }


    /** 
      Sort the data, invoking the specified method.
     */
    public void sort( final int method) {
        if(      method == SELECTION_METHOD) selectionSort();
        else if( method == INSERTION_METHOD) insertionSort();

        // bubble sort variants
        else if( method == BUBBLE_LARGE_METHOD     ) bubbleSort_large();
        else if( method == BUBBLE_SMALL_METHOD     ) bubbleSort_small();
        else if( method == BUBBLE_EARLY_EXIT_METHOD) bubbleSort_earlyExit();
        else if( method == BUBBLE_DO_WHILE_METHOD  ) bubbleSort_doWhile();
        
        else System.out.println( "sort not yet implemented");
    }


    /** 
      bubble sort the smallest as-yet-unsorted element leftwards
     */
    private void bubbleSort_small() {
        
        for( int dest = 0
           ; dest < data.length -1  // stop before last element,
               // since a single element is sorted trivially
           ; dest++
           ){
               
            // bubble the smallest as-yet-unsorted element leftwards 
            // to its destination position, next to the already-sorted items
            for( int pairStart = data.length - 2
               ; pairStart >= dest
               ; pairStart--
               ) {
                if( data[ pairStart].compareTo( data[ pairStart +1]) > 0) {
                    // swap
                    Comparable temp = data[ pairStart];
                    data[ pairStart] = data[ pairStart +1];
                    data[ pairStart +1] = temp;
                }
                
                // for debugging
                System.out.println( toString());
            } // end of inner loop through pairs
            
            // for debugging
            System.out.println(
              "end of pass that guarantees sorted through index " + dest);
        }
    }

    
    /** 
      bubble sort the largest as-yet-unsorted element rightwards
     */
    private void bubbleSort_large() {
        
        for( int dest = data.length -1 
           ; dest > 0  // stop before last element,
               // since a single element is sorted trivially
           ; dest--
           ) {
               
            // bubble the largest as-yet-unsorted element to 
            // its final position, next to the already-sorted items
            for( int source = 0
               ; source < dest  // before dest, since comparing to next item
               ; source++
               ) {
                if( data[ source].compareTo( data[ source +1]) > 0) {
                    // swap
                    Comparable temp = data[ source];
                    data[ source] = data[ source +1];
                    data[ source +1] = temp;
                }
                
                // for debugging
                System.out.println( toString());
            } // end of inner loop through source
            // for debugging
            System.out.println( "end of pass that populates position " + dest);
        }
    }


    /** 
      bubble sort with early exit
     */
    private void bubbleSort_earlyExit() {
        int sortedThruIndex = -1; // none known to be sorted, yet
        while( sortedThruIndex < data.length -2){  // stop before last
               // element, since a single element is sorted trivially

            int lastSwapStart = data.length -1; // loop-ending optimism: array
               // is already sorted. May be modified inside this loop.
            
            // bubble the smallest as-yet-unsorted element leftwards 
            // to its home position, next to the already-sorted items
            for( int pairStart = data.length - 2
               ; pairStart > sortedThruIndex
               ; pairStart--
               ) {
                if( data[ pairStart].compareTo( data[ pairStart +1]) > 0) {
                    lastSwapStart = pairStart; 
                    
                    // swap
                    Comparable temp = data[ pairStart];
                    data[ pairStart] = data[ pairStart +1];
                    data[ pairStart +1] = temp;
                }
                
                // for debugging
                System.out.println( toString());
            } // end of inner loop through pairs
            sortedThruIndex = lastSwapStart; 
            
            // for debugging
            System.out.println(
              "end of pass. Array is sorted through index " 
              + sortedThruIndex
              + " of " + (data.length -1)
              );
        }
    }

    /** 
      bubble sort, using a do-while to implement early exit
     */
    private void bubbleSort_doWhile() {
        int sortedThruIndex = -1; // none known to be sorted, yet
        do{ // One pass is always required, even if it finds all data sorted.
            int lastSwapStart = data.length -1; // loop-ending optimism: array
               // is already sorted. May be modified inside this loop.
            
            // bubble the smallest as-yet-unsorted element leftwards 
            // to its home position, next to the already-sorted items
            for( int pairStart = data.length - 2
               ; pairStart > sortedThruIndex
               ; pairStart--
               ) {
                if( data[ pairStart].compareTo( data[ pairStart +1]) > 0) {
                    lastSwapStart = pairStart; 
                    
                    // swap
                    Comparable temp = data[ pairStart];
                    data[ pairStart] = data[ pairStart +1];
                    data[ pairStart +1] = temp;
                }
                
                // for debugging
                System.out.println( toString());
            } // end of inner loop through pairs
            sortedThruIndex = lastSwapStart; 
            
            // for debugging
            System.out.println(
              "end of pass. Array is sorted through index " 
              + sortedThruIndex
              + " of " + (data.length -1)
              );
        } while( sortedThruIndex < data.length -2); // stop before last
            // element, since a single element is sorted trivially
    }


    /** 
      insertion sort
     */
    private void insertionSort() {
        //  outer loop through the indexes whose values need sorting.
        for( int indexOfValueToBeSorted = 1 // 0 is already sorted, trivially
           ; indexOfValueToBeSorted < data.length
           ; indexOfValueToBeSorted++
           ) {
            Comparable valueToBeSorted = data[ indexOfValueToBeSorted];
            
            // destination hunt inner loop: Where among the already-sorted
            // values does valueToBeSorted belong? Look left.
            int indexAlreadySorted;  // The index is used after the loop.
            for( indexAlreadySorted = indexOfValueToBeSorted -1
               ; indexAlreadySorted >= 0
               ; indexAlreadySorted--
               )
                if( valueToBeSorted.compareTo( data[ indexAlreadySorted]) <= 0)
                    // Shift the already-sorted value to the right,
                    // to open a hole.
                    data[ indexAlreadySorted +1] = data[indexAlreadySorted];
                else break; // found the destination

            // When we get here (after the destination-hunting loop), the
            // destination is known, so drop the valueToBeSorted in the hole.
            data[ indexAlreadySorted +1] = valueToBeSorted;

            // for debugging, after each insertion
            System.out.println( "  debugging: boundary follows index "
                              + indexOfValueToBeSorted
                              + "  data: " + toString()
                              );
           } // end of "outer loop through the indexes whose values need sorting"
    }


    /** 
      selection sort
     */
    private void selectionSort() {
        System.out.println( "sort not yet implemented");
    }


    /** 
      someday: To be useful, the class probably require a .get method.
               But testing it requires an .equals method.
               That complication seems not worthwhile at this point.
               This code is retained as a placeholder of good intentions.
      @return a reference to the data
     */
    // public Comparable[] get() {
    // }
}
