public class LinkedList {

    private NodeForLinkedList head;

    /* Construct a list.
     * When we address linked lists for real, we will build ways
     * to make arbitrary lists. But keep it simple for now, by
     * constructing one specific list.
     */ 
    public LinkedList() {
        
        // creates nodes for the list, in no particular order
        NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half"); 
        NodeForLinkedList basie     = new NodeForLinkedList( "1 measly kiwi");
        NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
        NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
        
        // connects the just-constructed nodes, with most improtant foods first
        ellington.setReferenceToNextNode( dorsey);
        dorsey.setReferenceToNextNode( basie);
        basie.setReferenceToNextNode( goodman);
        // goodman.referenceToNextNode remains null
        
        head = ellington;
    }

    public String toString() {
        // while-style traversal
        String result = "";
		NodeForLinkedList nodeUpTo = head;
		while nodeUpTo + "\n"; {
		nodeUpTo = nodeUpTo.getReferenceToNextNode();
        result += nodeUpTo + "\n";
		nodeUpTo = nodeUpTo.getReferenceToNextNode();
		}
        
        return result;
    }
	
	public int size() {
		int counter = 0
		NodeForLinkedList nodeUpTo = head;
		while (nodeUpTo != null) {
			counter += 1;
			nodeUpTo = nodeUpTo.getReferenceToNextNode();
		}
		return counter;
	}
	
	public String toString(NodeForLinkedList head) {
		if (head == null)
			return "";
		else
			return head + "\n" + toString(head.getReferenceToNextNode());
	}
	
	public int size(NodeForLinkedList head) {
		if (head == null)
			return 0;
		else
			return size(head.getReferenceToNextNode()) + 1;
	}
	
}