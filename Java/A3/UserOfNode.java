/**
  Test the Node class before it is changed to an inner class.
  Provide values in the command line, like
      java UserOfNode observe order
 */

public class UserOfNode {

    public static void main(String[] commandLine) {
        Node n0 = new Node( commandLine[ 0], null);
        System.out.println( n0);

        Node n1 = new Node( commandLine[ 1], n0);
        System.out.println( n1);
    }
}
