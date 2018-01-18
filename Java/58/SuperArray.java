/**
  SuperArray stores list data and implements list operations
  by encapsulating an array.
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class SuperArray {

    private Object[] _data;        // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;
    private final double TOLERANCE = 1e-6;

    /**
      @return whether two arrays are equivalent, considering...
              Strings ignoring case;
              Doubles within TOLERANCE
     */
     public boolean equals( SuperArray other) {

        // Lengths must match. Check SuperArray lengths without
        // iteration, unlike LinkedList.
        if( filledElements != other.filledElements)
            return false;

        // Compare elements for equivalence.
        for( int i = 0; i < filledElements; i++)
            if( _data[i] instanceof String) {
                String s =  (String)_data[i];
                String s2 = (String)other._data[ i];
                if( ! s.equalsIgnoreCase( s2))
                    return false;
            }
            else if( _data[i] instanceof Double) {
                Double d =  (Double)_data[i];
                Double d2 = (Double)other._data[ i];
                if( Math.abs( d - d2) > TOLERANCE )
                    return false;
            }
            else // use default equivalence check
                if( ! _data[i].equals( other._data[i]))
                    return false;


        // Reaching here means all elements are equivalent.
        return true;
     }



    // -------- previously-tested code below here ---------
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
       @return a string representation of this list, in [a,b,c,] format.
       Uses polymorphism. For each of this method's implicit calls to
           _data[ i].toString()
       the JVM will find the overriding method for the actual class
       of the object that _data[ i] refers to.
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
         if( filledElements == _data.length)
			 expand();

         _data[ filledElements] = value;
         filledElements++;
         // idiomatic version: _data[ filledElements++] = value;
        return true;
     }


    /**
      Doubles the capacity of the SuperArray,
      preserving existing _data
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
