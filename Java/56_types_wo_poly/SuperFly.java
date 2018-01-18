/**
  SuperFly encapsulates the implementation of a list of disparate types,
  programmed without polymorphism
 */
public class SuperFly {

    private int filledElements; // the number of elements in this list

    // underlying containers
    private int[]    intData;
    private double[] doubleData;
    private String[] stringData;
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;


    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperFly() {
		intData = new int[INITIAL_CAPACITY];
		doubleData = new double[INITIAL_CAPACITY];
		StringData = new String[INITIAL_CAPACITY];
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
		// String result = "[";
        // for( int i = 0; i < filledElements; i++)
            // result += intData[ i] + ",";
        // return result + "]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type   // values have same meaning as in typeOfElements
                       , int intValue
                       , double doubleValue
                       , String stringValue
                       ) {

         if (type == 0)
			 if( filledElements == intData.length) expand();
			 intData[ filledElements] = intValue;
		 else if (type == 1)
			 if( filledElements == doubleData.length) expand();
			 doubleData[filledElements] = doubleValue;
		 else
			 if( filledElements == doubleData.length) expand();
			 StringData[ filledElements] = stringValue;
         filledElements++;
		 return true;
     }


    /** 
      Doubles the capacity of the SuperFly, 
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
		int[] bigger = new int[ intData.length * 2];
        for( int i = 0; i < filledElements; i++)
            bigger[i] = intData[i];
        intData = bigger;
		
		double[] biggerD = new double[ doubleData.length * 2];
        for( int i = 0; i < filledElements; i++)
            biggerD[i] = doubleData[i];
        doubleData = biggerD;
		
		String[] biggerS = new String[ StringData.length * 2];
        for( int i = 0; i < filledElements; i++)
            biggerS[i] = StringData[i];
        StringData = biggerS;
     }
}
