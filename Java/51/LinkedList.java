public class LinkedList {

    private NodeForLinkedList head;
    

    /* Construct either...
     *   o  a short list; or
     *   o  a longer list with a short list as one node's cargo
     */
    public LinkedList () {
        head = new NodeForLinkedList("");
    }

    public void addFirst(String n) {
		NodeForLinkedList storage = this.head;
		head = new NodeForLinkedList(n);
		head.setReferenceToNextNode(storage);
    }

    public void addLast(String n) {
		NodeForLinkedList curNode = head;
		curNode = curNode.getReferenceToNextNode();
		curNode.setReferenceToNextNode(new NodeForLinkedList(n + " --> "));
    }
    
	// the rest is given code
    
    public LinkedList( int sizeWanted) {
        if( sizeWanted == 2) { // make a short list to be used as a sub-list
            NodeForLinkedList terry = new NodeForLinkedList( "mango");
            NodeForLinkedList green = new NodeForLinkedList( "grapes");
            terry.setReferenceToNextNode( green);
            head = terry;
        }
           
        else { // make a long list, including a short sub-list
            NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half");
            NodeForLinkedList basie     = new NodeForLinkedList( new LinkedList(2));
            NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
            NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
           
            // connects the just-constructed nodes
            ellington.setReferenceToNextNode( dorsey);
            dorsey.setReferenceToNextNode( basie);
            basie.setReferenceToNextNode( goodman);
            // goodman.referenceToNextNode remains null
           
            head = ellington;
        }
    }
	
	
	//1: Compare the lists in String form (using the toString methods)
	// public boolean equals (LinkedList other) {
		// return toString().equals(other.toString());
	// }
	
	public boolean equals(LinkedList other) {
        if (size() != other.size())
            return false;
        else if (cref == null && other.cref == null)
            return true;
        else if (current.equals(other.current) && cref.equals(other.cref)){
            current = cref;
            other.current = other.cref;

            cref = cref.getReferenceToNextNode();
            other.cref = other.cref.getReferenceToNextNode();
            return equals(other.current);
        }
        else
            return false;
    }
	
    ////while-style
    // public String toString() {
        // String result = "while-style: ( "; // enclosed in parens, like Racket
       
        // NodeForLinkedList n = head;
        // while(  n != null) {
            // result +=  n;
            // n = n.getReferenceToNextNode();
        // }
        // return result + " )";
    // }
	
	//recursive-style
	public  String toString() {
        return "via recursion: ( " + toString_nodeChain( head) + " )";
    }
    private String toString_nodeChain( NodeForLinkedList n) {
        if( n == null) 
			return "";
        else 
			return n + toString_nodeChain( n.getReferenceToNextNode());
    }
			
}

