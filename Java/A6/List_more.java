/**
  Specify required methods for 
  a portion of the real Java List interface,
  de-generic'ed into a List of String
 */

public interface List_more {

    // Methods for the current assignment start here.


    // /**
      // add-at-index, colloquially.
      // Insert @newvalue at the specified position in this list.
      // Shift the element currently at that position (if any)
      // and any subsequent elements to the right (adds one to 
      // their indices). 
      // @return void! Different from add-at-end! Who knows why?
     // */
    // public void add( int index, String newValue);


    // /**
      // Remove the element at the specified position in this list.
      // @return the element previously at the specified position
     // */
    // public String remove( int index);
    
    
    // Methods below here were written for the previous assignment.
    /**
      @return the number of elements in this list
     */
    public int size(); 


    /**
      add-at-end, colloquially.
      Append @newValue to the end of this list
      @return true (as specified by Collection.add)
     */
    public boolean add( String newValue); 


    /**
      @return the String at the specified position in this list.
     */
    public String get( int index); 


    /**
      Replace the String at the specified position in this list
      with @newValue.
      @return the String previously at the specified position
     */
    public String set( int index, String newValue); 
}
