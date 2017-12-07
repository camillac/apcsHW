public class ArrayPlus {
	
	int[] refToArray;
	
	//constructor
	public ArrayPlus( int capacity ) {
		refToArray = new int[capacity]; //these elements are initialized at 0
	}
	
	//to-String
	public String toString() {
		String meow = "";
		for (int x = 0; x < refToArray.length; x++)
			meow += "element [" + x + "]: " + refToArray[x] + System.lineSeparator();
		return meow;
	}
	
	private ArrayPlus ( int capacity, int maxRandom) {
		refToArray = new int[capacity]; //these elements are initialized at 0
		for (int x = 0; x < capacity; x++)
			refToArray[x] = (int) (Math.random() * maxRandom);
	}
	
	public int indexOf( int findMe) { // cant get the index 
		for (int n = 0; n < refToArray.length; n++) {
			if (refToArray[n] == findMe)
				return n;
		}
		return -1
	}
	
	public int[] freqFull(ArrayPlus freqs) {
		for (into num = 0; num < refToArray.length; num++) {
			freqs.refToArray[refToArray[num]]++;
		}
	}

}