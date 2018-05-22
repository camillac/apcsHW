/**
  Represent a list as a chain of nodes.
 */

/**
  Represent a list as a chain of nodes.

  Differs from previous implementations chiefly in having a
  sentinel node, beforeHead, to eliminate special cases for
  inserting and deleting at the beginning of the list.
 */

public class LinkedList implements List_iter {
	
	
	
    // --------- new code for the current assignment start here ---------
    private Node tail; /* a reference to the last node in the list, when
       the list is not null. When the list is null, this field is set to beforeHead.
       */

	// --------- code from previous assignments follows ---------


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


    /**
      @return an iterator for this class (that is LinkedList)
     */
    public java.util.Iterator< String> iterator() {
        return new Cursor();
    }


    /**
      Represent iteration through a LinkedList
     */
    public class Cursor implements java.util.Iterator< String>  {
        private Node nextNode;  /* a reference to a node
          whose cargo has yet to be iterated through,
          or null when all nodes have been processed.  */
          
        public Cursor() { nextNode = beforeHead.next;}
        
        /**
          @throws java.util.NoSuchElementException unless at least one element
                                                   remains to be iterated through
          @return the next String element that remains to be iterated through.
         */
        public String next() {
            if( nextNode == null)
                throw new java.util.NoSuchElementException();
    
            String cargoFromOldNextNode = nextNode.cargo;
            nextNode = nextNode.next;
            return cargoFromOldNextNode;
        }
    

        /**
          @return the Boolean value of the statement
                  "At least one element remains to be iterated through".
         */
        public boolean hasNext() {
            return nextNode != null;
        }
    }
        
    /** Construct an empty linked list.
     */
    public LinkedList() {
        beforeHead = new Node( null, null);
		tail=beforeHead;
    }

    /**
      Append @newValue to the end of this list
      @return true (as specified by Collection.add)

      consider factoring: should this be merged
      with add-at-index ?
     */
    public boolean add( String newValue) {
        tail.next = new Node( newValue, null);
		tail=tail.next;
        return true;
    }
    
/**
      add-at-index, colloquially.
      Insert @newValue at the specified position in this list.
      Shift the element currently at that position (if any)
      and any subsequent elements to the right (adds one to
      their indices).

      void return! Different from add-at-end! Who knows why?
     */
    public void add( int index, String newValue){
	if (index == size())
	    add(newValue);
	else {
	    Node prev = nodeBefore( index);
	    Node insertMe = new Node( newValue, prev.next);
	    prev.next = insertMe;
	}
    }
        /**
      Remove the element at the specified position in this list.
      @return the element previously at the specified position
     */
    public String remove( int index) {
        Node prev = nodeBefore( index);
        Node axMe = prev.next;
		if (axMe== tail){
			tail=prev;
		}
       
        // a node to remove is required to exist
        if( axMe  == null)
            throw new IndexOutOfBoundsException(
              "Index " + index + " exceeds the size of this list.");
        String axMeElement = axMe.cargo;
        prev.next = axMe.next;
        return axMeElement;
    }
	
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
      @return the String at the specified position in this list.
     */
    public String get( int index){
        return nodeAt( index).cargo;
    }


    /**
      Replace the String at the specified position in this list
      with @newValue.
      @return the String previously at the specified position
     */
    public String set( int index, String newValue) {
        Node element =  nodeAt( index);
        String oldCargo = element.cargo;
        element.cargo = newValue;
        return oldCargo;
    }
    // -------------- end of List interface methods --------------


    /**
      @return the node before the node representing the requested
              element, or throw the required exception
     */
    private Node nodeBefore( int index) {
        if( index < 0)
            throw new IndexOutOfBoundsException(
              "Negative index " + index + " is invalid for a list.");

        // Traverse to the node before the node at @index.
        Node prev;  // so variable persists after the loop
        int stepsToTake = index;
        for( prev = beforeHead
           ; stepsToTake--  > 0
           ; prev = prev.next)
            if( prev.next == null) // cannot take a step
                throw new IndexOutOfBoundsException(
                  "Index " + index + " exceeds the size of this list.");
        return prev;
    }


     /**
      @return the node representing the requested element
     */
    private Node nodeAt( int index) {
        Node wanted = nodeBefore( index).next;
        if( wanted  == null)
            throw new IndexOutOfBoundsException(
              "Index " + index + " exceeds the size of this list.");
        return wanted;
    }


    /**
      @return a string representation of this LinkedList instance
     */
    public String toString() {
        String result = "beforeHead --> ";
        if( beforeHead.next == null)
            result += "empty list";
        else result += beforeHead.next;
        return result;
    }


    /**
      Represent a node in a linked list as an inner class.
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
            String result = cargo;

            // Indicate whether this node has a link to another.
            if( next == null)
                 result += " [no next]";
            else result += " --> " + next;

            return result;
        }

    }

}