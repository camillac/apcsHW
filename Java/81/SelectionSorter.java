public class SelectionSorter extends Sorter {
	public void sort() {
          int smallindex;
          for(int i = 0; i < super.data.length; i++)
          {
               smallindex = i; // set first element as smallest
               for(int j = i + 1; j < super.data.length; j++) // find smallest
                    if(super.data[j].compareTo(super.data[smallindex]) < 0)
                         smallindex = j;
               if(smallindex != i)
                    swap(super.data, smallindex, i);
          }
     }
	 private static void swap(Object[] array, int index1, int index2)
     {
          Object temp = super.data[index1];
          super.data[index1] = super.data[index2];
          super.data[index2] = temp;
     } 
}