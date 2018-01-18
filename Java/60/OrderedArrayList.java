public class OrderedArrayList {
	private int[] _data;  // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;
	
	public OrderedArrayList() {
		_data = new int[ INITIAL_CAPACITY];
	}
	
	public String toString() {
        String result = "[";
        for( int i = 0; i < filledElements; i++)
            result += _data[ i] + ",";
        return result + "]";
    }

	
	public boolean add(int value) {
		// expand if necessary
        if( filledElements == _data.length) expand();
		
		for (int i = 0; i < filledElements; i++) {
			if (value > _test[i]) {
				for (int x = filledElements - 1; x < i; x++ ) {
					_data[ x] = _data[ x-1];
				}
				_data[ i] = value; // store new value
			}
		}
        filledElements++;
        // idiomatic version: _data[ filledElements++] = value;
        return true;
	}
	
	private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
        int[] bigger = new int[ _data.length * 2];
        for( int i = 0; i < filledElements; i++)
            bigger[i] = _data[i];
        _data = bigger;
     }
}