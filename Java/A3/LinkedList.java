/**
  Represent a list as a chain of nodes.
  
  Differs from previous implementations chiefly in having a
  sentinel node, beforeHead, to eliminate special cases for 
  inserting and deleting at the beginning of the list.
 */

public class LinkedList implements List_start {

    private Node beforeHead;  /* a reference to a node
        whose @next field holds either...
           o  null, if the list is empty; or
           o  a reference to the node that is the head of this list.
              The "head" is also known as "element 0" and
               "the first element" by people who have not yet
               learned that ordinal numbers like "first" sow
               confusion.
        The cargo field of the beforeHead node is ignored.
      */


    /** Construct an empty linked list.
     */
    public LinkedList() {
        beforeHead = new Node(null, null);
    }


    // -------------- List interface methods follow --------------

	/**
      @return the number of elements in this list
     */
    public int size(){
		int counter = 0;
		Node nextNode = beforeHead;
		while (nextNode.next != null){
			counter++;
			nextNode = nextNode.next;
		}
		return counter;
	}


    /**
      Append @newValue to the end of this list
      @return true (as specified by Collection.add)
     */
    public boolean add( String newValue){
		Node nextNode = beforeHead;
		while (nextNode.next != null) {
			nextNode = nextNode.next;
		}
		nextNode.next = new Node(newValue, null);
		
		return true;
	}
	


    /**
      @return the String at the specified position in this list.
     */
    public String get( int index){
		Node nextNode = beforeHead;
		for (int x = 0; x <= index; x++) {
			nextNode = nextNode.next;
		}
		return nextNode.cargo;
	}


    /**
      Replace the String at the specified position in this list
      with @newValue.
      @return the String previously at the specified position
     */
    public String set( int index, String newValue){
		Node nextNode = beforeHead;
		for (int x = 0; x <= index; x++) {
			nextNode = nextNode.next;
		}
		String old = nextNode.cargo;
		nextNode.cargo = newValue;
		return old;
	}
	
    // -------------- end of List interface methods --------------


    /**
      @return a string representation of this LinkedList instance
     */
    public String toString() {
        String result = "beforeHead --> ";
        if( beforeHead.next == null)
            result += "empty list";
        else result += beforeHead.next.toStringDefault()
                     + System.lineSeparator()
                     + beforeHead.next.toString();
        return result;
    }

/**
  Represent a node in a linked list.
  The cargo is limited to String for simplicity, so that we
  concentrate on list operations. Ideally the type should be generic.
 */
	private class Node {

		/* The instance fields are declared PUBLIC only for testing.
		   When you make Node an inner class. PRIVATE-ize these fields,
			and delete this comment.
		 */
		public String cargo;
		public Node next;


		/**
		  Construct an instance. Either param can be null.
		 */
		public Node( String cargo, Node next) {
			this.cargo = cargo;
			this.next = next;
		}
		

		/**
		  @return a string representation of this Node instance.
		 */
		public String toString() {
			String result = cargo + " @ " + toStringDefault();
						  
			// Indicate whether this node has a link to another.
			if( next == null)
				 result += " [no next]";
			else result += " --> " + next;

			return result; 
		}


		/**
		  @return: the default toString for this Node instance, 
				   to aid checking references during testing
				   For example: Node@1db9742
		 */
		public String toStringDefault() {
			return super.toString();
		}
	}
}
