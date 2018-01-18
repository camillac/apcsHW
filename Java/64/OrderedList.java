public interface OrderedList<T> {

	//a toString!
	public String toString();

	//adds @value to the OrderedList.
	public void add( int value);

	//returns the size of the OrderedList.
	public int size();

	//returns the value at index @index.
	public T get(int index);

	//removes the value at index @index and returns the removed value.
	public T remove(int index);
	
}