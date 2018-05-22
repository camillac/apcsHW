/**
  Represent a queue abstract data type,
  implementing the Queue interface by
  encapsulating our home-grown LinkedList with
  from hwAC (with the tail reference).
 */

public class Queue_hasA_LinkedList implements Queue {


    // ----- encapsulated data, aka "data hiding" -----
    private LinkedList queue;
	
    // ----- end of "encapsulated data" -----
    

    /**
      Construct an instance
     */
    public Queue_hasA_LinkedList() {
		queue = new LinkedList();
    }

	/**
      Add to the back of this queue.
      @return true (as specified for Collection.add(E)).
     */
    public boolean enqueue( String element){
		return queue.add( element );
	}


    /**
      @return the String from front of this queue,
              removing it from the queue.
      Throw java.util.NoSuchElementException if the
      queue is empty.
     */
	public String dequeue(){
		if (queue.size() == 0) {
			throw new java.util.NoSuchElementException();
		}
		return queue.remove(0);
	}


    /**
      @return the String from front of this queue,
              LEAVING it in the queue.
      Throw java.util.NoSuchElementException if the
      queue is empty.
     */
    public String peek(){
		if (queue.size() == 0) {
			throw new java.util.NoSuchElementException();
		}
		return queue.get(0);
	}


    /**
      @return the Boolean value of the statement
                  "This queue is empty."
     */
    public boolean isEmpty(){
		return queue.size() == 0;
	}
	
    /**
      @return a string representation of this instance
      
      contributed by Milan Haimman, class of 2019
     */
    public String toString() {
        String result = System.lineSeparator()
                      + "Front"    + System.lineSeparator() 
                      + "--------" + System.lineSeparator();
        for(String elem : queue)
            result += elem + System.lineSeparator();
        
        result += "--------" + System.lineSeparator() 
               +  "Back";
        return result; 
	}
}