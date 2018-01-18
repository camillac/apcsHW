/** 
  OrderedArrayList
  
  a list with the invariant the elements are in order by
  increasing value.
 */

public class OrderedArrayList implements OrderedList{

    private SuperArray arrayList;

    public OrderedArrayList() {
        arrayList = new SuperArray();
    }

    /** 
      @return a string representation of this OrderedArrayList
     */
    public String toString() {
        return arrayList.toString();
    }

    public int size() {
		return arrayList.size();
		}
	
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < arrayList.size() && arrayList.get( dest) < value
            ; dest++) ;
         // System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }
	 
	 
	 public static void main(String[] args){
	 }
}
