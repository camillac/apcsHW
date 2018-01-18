/**
  SuperArray implements list data and operations
  by encapsulating an array
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

/*
	- What does the compiler check?
		The compiler checks if the syntax is correct and run-able.
	
	- What does the compiler produce?
		The compiler produces code that the JVM can use.
	
	- What does the JVM do?
		The JVM tries to run through the code, displaying exceptions.
		
*/

public class SuperArray {

    private Object[] _data;  // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;

    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperArray() {
        _data = new Object[ INITIAL_CAPACITY];
        // filledElements 0 is already correct
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /** 
       @return a string representation of this list, in [a,b,c,] format
      */ 
    public String toString() {
        String result = "[";
        for( int i = 0; i < filledElements; i++)
            result += _data[ i] + ",";
        return result + "]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( Object value) {
         // expand if necessary
         if( filledElements == _data.length) expand();

         _data[ filledElements] = value;
         filledElements++;
         // idiomatic version: _data[ filledElements++] = value;
        return true;
     }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
        Object[] bigger = new Object[ _data.length * 2];
        for( int i = 0; i < filledElements; i++)
            bigger[i] = _data[i];
        _data = bigger;
     }
}

