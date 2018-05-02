/**
  Represent a list as a chain of nodes.
  
  Differs from previous implementations chiefly in having a
  sentinel node, beforeHead, to eliminate special cases for 
  inserting and deleting at the beginning of the list.
 */

public class LinkedList implements List_more {

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
        beforeHead = new Node( null, null);
    }

    // -------------- List interface methods follow --------------

    // Methods for the current assignment start here.
    
    
    
    // Methods below here were written for the previous assignment.
    /**
      @return the number of elements in this list
     */
    public int size() {
        int nodeCounter = 0;
        
        // Traverse to the last element in the list.
        for( Node element = beforeHead.next
           ; element != null
           ; element = element.next)
            nodeCounter++;
        return nodeCounter;
    }


    /**
      Append @newValue to the end of this list
      @return true (as specified by Collection.add)
     */
    public boolean add( String newValue) {
        // Traverse to the node before the last node in the list.
        Node findLast;  // so variable persists after the loop
        for( findLast = beforeHead
           ; findLast.next != null
                                                                       ; findLast = findLast.next) ; // body of loop is empty
        findLast.next = new Node( newValue, null);
        return true;
    }
	
	public void add( int index, String newValue) {
		
		if (index > this.size() || index < 0) {
			throw new IndexOutOfBoundsException("Not valid index");
		}
		
		Node nodeToAdd = new Node(newValue, beforeHead);
		
		if (index == 0){
			nodeToAdd.next = beforeHead.next;
			beforeHead.next = nodeToAdd;
		}
		
		else {
			Node curNode;
			for( curNode = beforeHead.next
			   ; index--  > 1
			   ; curNode = curNode.next) ; // body of loop is empty
		   nodeToAdd.next = curNode.next;
		   curNode.next = nodeToAdd;
		}
	}
	
	public Node remove( int index ) {
		
		if (index > this.size() || index < 0) {
			throw new IndexOutOfBoundsException("Not valid index");
		}
		
		Node nodeToRemove = new Node(null, null);
		
		if (index == 0){
			nodeToRemove.cargo = beforeHead.next.cargo;
			beforeHead.next = beforeHead.next.next;
		}
		
		else if (index == this.size()){
			nodeToRemove.cargo = get( index - 1);
			set(index - 1, null);
		}
		
		else {
			Node curNode;
			for( curNode = beforeHead.next
			   ; index--  > 1
			   ; curNode = curNode.next) ; // body of loop is empty
		   nodeToRemove.cargo = curNode.next.cargo;
		   curNode.next = curNode.next.next;
		}
		
		return nodeToRemove;
	}
	
    /**
      @return the String at the specified position in this list.
     */
    public String get( int index){
		// test for null pointer exception
		if (index >= this.size() || index < 0) {
			throw new IndexOutOfBoundsException("Not valid index");
		}
		
        // Traverse to the requested element's node.
        Node element;  // so variable persists after the loop
        for( element = beforeHead.next
           ; index--  > 0
           ; element = element.next) ; // body of loop is empty
        return element.cargo;
    }


    /**
      Replace the String at the specified position in this list
      with @newValue.
      @return the String previously at the specified position
     */
    public String set( int index, String newValue) {
		
		if (index >= this.size() || index < 0) {
			throw new IndexOutOfBoundsException("Not valid index");
		}
		
        // Traverse to the requested element's node.
        Node element;  // so variable persists after the loop
        for( element = beforeHead.next
           ; index--  > 0
           ; element = element.next) ; // body of loop is empty
        String oldCargo = element.cargo;
        element.cargo = newValue;
        return oldCargo;
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
      concentrate on list operations. Ideally it should be generic.
     */
    private class Node {

        private String cargo;
        private Node next;


        /**
          Construct an instance. Either param can be null.
         */
        private Node( String cargo, Node next) {
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
