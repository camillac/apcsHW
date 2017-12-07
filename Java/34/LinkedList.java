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

 
    //for loop 
    public String toString() {
        String result = "for-style: ( "; // enclosed in parens, like Racket
        
        for (NodeForLinkedList n = head; n != null; n = n.getReferenceToNextNode()) {
            result += n;
        }
        return result + " )";
    }
    
    public  int size(){
        int result = 0;
        for(NodeForLinkedList n = head; n != null; n = n.getReferenceToNextNode() ) {
            result += 1;
        }
        return result;
    }
}

