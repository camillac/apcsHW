/** 
  OrderedArrayList_String, based on OrderedArrayList v1
  
  a list of String elements, with the invariant the elements
  are in order by increasing value.
 */
import java.util.ArrayList;

public class OrderedArrayList_String  {
    private ArrayList<String> arrayList;

    /** 
      @returns the index of the first occurrence of @findMe
      in this list, or -1 if this list does not contain @findMe.
     */
    public int index( Object findMe) {
		
		/*
        // replace this linear search with a binary search
        for( int i = 0; i < arrayList.size(); i++)
            // if( findMe.equals( arrayList.get( i))) return i;
            if( arrayList.get( i).equals( findMe)) return i;
        return -1;
		*/
		
		//binary search
		String findMeS = (String) findMe;
		int lowest = 0;
		int middle = (int) (arrayList.size() / 2);
		int highest = arrayList.size();
		// while (!(arrayList.get(middle).equals(findMeS))) {
			// System.out.print(middle);
			// if (arrayList.get(middle).compareTo(findMeS) < 0){
				// lowest = middle;
				// middle = (highest + middle)/2;
			// }
			// else if (arrayList.get(middle).compareTo(findMeS) > 0) {
				// highest = middle;
				// middle = (lowest + middle)/2;
			// }
			// else {
				// middle = -1;
			// }
		// }
		
		// return middle;
		
		return recurseIndex(lowest, middle, highest, findMeS);
    }
	
	//recursive
	private int recurseIndex(int lowest, int index, int highest, String findMe) {
		// debugging
		//System.out.println(lowest + " " + index + " " + highest);
		
		// index = index we want to find
		if (arrayList.get(index).equals(findMe))
		    return index;
		
		if (!(arrayList.get(0).equals(findMe)) && lowest == index || highest == index)
		    return -1;
		// index given lower than index we want to find
		else if (arrayList.get(index).compareTo(findMe) < 0)
		    return recurseIndex(index, (int) (highest + index)/2, highest, findMe);
		
		// index given is higher than index we want
		else if (arrayList.get(index).compareTo(findMe) > 0){
		    return recurseIndex(lowest, (int) (lowest + index)/2, index, findMe);}
		else
			return -1;
	}

   /** 
      helper function for constructor
      @return the index of the lexicographically first of the elements,
              ignoring null elements, and
              using the classic reigning champ algorithm
     */
     private int champIndex( ArrayList<String> challengers) {
		 int champ = -1;
		 String champS = "zzzzzz";
		 for (int i = 0; i < challengers.size(); i++) {
		     if (challengers.get(i) != null && challengers.get(i).compareTo(champS) < 0)  {
				 champ = i;
				 champS = challengers.get(i);
			 }
		 }
		 
		 return champ;
		 // int champ = challengers.size();
		 // for (int i = 0; i < challengers.size(); i++) {
			 // if (index(challengers.get(i)) < champ)
				 // champ = index(challengers.get(i));
		 
		 // }
        //return 1;  // placeholder, awaiting replacement
     }


    /** 
      construct order from an unordered ArrayList
     */
    public OrderedArrayList_String( ArrayList<String> unordered) {

        ArrayList<String> data = new ArrayList<String>(unordered.size());
	
		for (int i = 0; i < unordered.size(); i++ ) {
		    //System.out.println(x);
		    int nextLargerAt = champIndex( unordered);
		    data.add(unordered.get( nextLargerAt) + "; ");
			
		    unordered.set(nextLargerAt, null);

		};
		System.out.println(data);
    }
    
    /* -------------------------------------------------------
       methods below here are versions of OrderedArrayList v1
       with minor modification to String type
     */
     
     
    /** 
      construct an empty instance
     */
    public OrderedArrayList_String() {
        arrayList = new ArrayList<String>();
    }

    /** 
      @return a string representation of this OrderedArrayList
     */
    public String toString() {
        return arrayList.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( String value) {
         int dest;
         for( // declare dest before loop, since it is needed after the loop
              dest = 0
            ;    dest < arrayList.size() 
              && arrayList.get( dest).compareTo( value) < 0
            ; dest++) ;

         System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }

     // pass through methods where possible
    public int size() {
      return arrayList.size();
    }

    public String get( int index) {
      return arrayList.get(index);
    }

    public String remove( int index) {
      return arrayList.remove( index);
    }
}
