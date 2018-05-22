/**
  Abstract Data Type for a queue of Strings
  
  "All interface members are implicitly public, but, 
  by convention, the PUBLIC modifier is omitted."
                      -- Arnold, Gosling, Holmes p121
 */

public interface Queue{

    /**
      Add to the back of this queue.
      @return true (as specified for Collection.add(E)).
     */
    boolean enqueue( String element);


    /**
      @return the String from front of this queue,
              removing it from the queue.
      Throw java.util.NoSuchElementException if the
      queue is empty.
     */
    String dequeue();


    /**
      @return the String from front of this queue,
              LEAVING it in the queue.
      Throw java.util.NoSuchElementException if the
      queue is empty.
     */
    String peek();


    /**
      @return the Boolean value of the statement
                  "This queue is empty."
     */
    boolean isEmpty(); 
}
