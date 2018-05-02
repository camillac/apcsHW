/**
  Specify required methods for 
  a portion of the real Java List interface,
  de-generic'ed into a List of String
 */

public interface List_start {

    /**
      @return the number of elements in this list
     */
    public int size(); 


    /**
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
