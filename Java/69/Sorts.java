/** 
  Implementations of sorting an array  
 */

public class Sorts {

    private Comparable[] data;  // avoid changing the user's data
    public final int SORTS_METHOD_SELECTION = 0;
    public final int SORTS_METHOD_INSERTION = 1;

    // constructor
    public Sorts( Comparable[] usersData) {
		data = usersData;
    }
    
    
    /** 
      @return a string representation of the data
     */
    public String toString() {
		String finalData = "{ ";
		for (int x = 0; x < data.length; x++) {
			finalData += data[x] + ", ";
		}
		finalData += "}";
		return finalData;
    }


    /** 
      @return a reference to the data
     */
     public Comparable[] get() {
		 return data;
     }


    /** 
      @return the boolean value of the statement
         "the data is in ascending order"
     */
     public boolean isSorted() {
         for (int x = 1; x < data.length; x++) {
			 if (data[x].compareTo(data[x-1]) < 0)
				 return false;
		 }
		 return true;
     }


    /** 
      Sort the data, invoking the specified method.
     */
     public void sort( final int method) {
		 if (method == 0)
			 selectionSort();
		 else if (method == 1)
			 insertionSort();
		 else
			 System.out.println("Neither insertion nor selection");
     }


    /** 
      insertion sort
     */
     private void insertionSort() {
		 for (int traverse = 1; traverse < data.length; traverse++){
			 Comparable itemBeingCompared = data[traverse];
			 int changes = 0;
			 // System.out.println("NEW ITEM COMPARED: " + data[traverse]);
			 for (int compare = traverse - 1; compare > -1; compare--){
				 Comparable itemBefore = data[compare];
				 // System.out.println("NEW BEFOREITEM COMPARED!!!!!!!!!!!!! " + data[compare]);
				 if (itemBeingCompared.compareTo(itemBefore) <= 0){
					 // System.out.println("itemBefore " + itemBefore);
					 // System.out.println("itemBeingCompared " + itemBeingCompared);
					 data[traverse - changes] = itemBefore;
					 data[compare] = itemBeingCompared;
					 // System.out.println("newRightone " + data[traverse]);
					 // System.out.println("newLeftone " + data[compare]);
					 // String finalData = "{ ";
					// for (int x = 0; x < data.length; x++) {
					// finalData += data[x] + ", ";
					// }
					// finalData += "}";
					// System.out.println(finalData);
					changes += 1;
				 }
			 }
		 }
				 
		 
         // for debugging, after each insertion
         System.out.println( "  debugging: boundary before index " + 0
                           + "data: ??"
                           );
     }


    /** 
      selection sort
     */
     private void selectionSort() {
     }
}
