public class NodeForLinkedList {

    private String cargo;
    private NodeForLinkedList referenceToNextNode;
    
    public NodeForLinkedList( String cargoParam) {
        // The point of a list from the user's perspective is
        // to store data.
        cargo = cargoParam;
    }
    
    public String toString() { 
        String result = cargo;
        
        // Indicate whether this NodeForLinkedList
        // has a link to another. 
        if( referenceToNextNode != null)
            result += " --> ";
        else result += " [no next]";
        return result; 
    }

    public void setReferenceToNextNode( 
       NodeForLinkedList referenceToNextNode) {
        // better maybe: add a param to the constructor.
        // Made a separate step for clarity in LinkedList.
        this.referenceToNextNode = referenceToNextNode;
    }
    
    public NodeForLinkedList getReferenceToNextNode() {
        return referenceToNextNode;
    }
}

