/**
  Represent a node in a linked list.
  The cargo is limited to String for simplicity, so that we
  concentrate on list operations. Ideally the type should be generic.
 */
public class Node {

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
