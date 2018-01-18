/** 
  OrderedArrayList
  
  a list with the invariant the elements are in order by
  increasing value.
 */
 
 import java.util.ArrayList;

public class OrderedArrayList implements OrderedList<Integer> {

    private ArrayList arrayList;

    public OrderedArrayList() {
        arrayList = new ArrayList();
    }

    /** 
      @return a string representation of this OrderedArrayList
     */
    public String toString() {
        return arrayList.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < arrayList.size() && ((int) (arrayList.get( dest)) < value); dest++)
			System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }

    public int size() {
      return arrayList.size();
    }

    public Integer get(int index) {
      return (Integer) (arrayList.get(index));
    }

    public Integer remove(int index) {
      return (Integer) (arrayList.remove(index));
    }
	
	public static void main(String[] args){}
}