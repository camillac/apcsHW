public class NodeForLinkedList {

    // new: 2 kinds of cargo,
    // with a boolean to record which is used
    private String     stringCargo;
    private LinkedList linkedListCargo;
    private boolean    cargoIsLinkedList;

    private NodeForLinkedList referenceToNextNode;
   
    // constructors for each kind of cargo
    public NodeForLinkedList( String cargo) {
        stringCargo = cargo;
    }
    public NodeForLinkedList( LinkedList cargo) {
        linkedListCargo = cargo;
        cargoIsLinkedList = true;
    }
   
    public String toString() {
        String result;
       
        if( cargoIsLinkedList)
            // recursive call for sub-list
            result = linkedListCargo.toString();
        else result = stringCargo;
       
        // Indicate whether this NodeForLinkedList
        // has a link to another.
        if( referenceToNextNode != null)
            result += " --> ";
        else result += "[no next]";
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
