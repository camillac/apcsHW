/**
  SuperArray implements list data and operations
  by encapsulating an array
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class SuperArray {

    private int[] _data;  // underlying container
    private int _size;    // the number of elements in this list


    /** 
      default constructor
      Constructs an empty list with an initial capacity of ten.
     */
    public SuperArray() {
		_data = new int[10];
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
		int ctr = _size - 1;
		int last = 0;

		if (_data[ctr]!=0)
		    return _size;
		while ( ctr
    }


     /** 
       @return a string representation of this list, in [a,b,c,] format
      */ 
    public String toString() {
		String meow = "";
		for (int x = 0; x < _data.length - 1; x++) {
			meow += _data[x] + ", ";
		}
		return "[ " + meow + " ]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
		 int[] addOne = new int[_size + 1];
		 for (int x = 0; x < _size - 1; x++) {
			addOne[x] = _data[x];
		}
		addOne[_size] = value;
		_data = addOne;
		_size = _data.length;
		return true;
     }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving extant data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
		   int[] newArray = new int[_size * 2];
			for (int x = 0; x < _data.length - 1; x++) {
				newArray[x] = _data[x];
			}
			_data = newArray;
			_size = _data.length;
     }

     
    /** 
      accessor  
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
		return _data[index];
    }


    /** 
      Set value at @index to @newValue
      
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set( int index, int newValue ) {
		int old = _data[index];
		_data[index] = newValue;
	
		return old;
    }
}
