public class UserOfLinkedList {

    public static void main(String[] commandLine) {
        LinkedList shopping = new LinkedList( 4);
       
        System.out.println( "\n"
                          + shopping  + "\n"
                          + "\n");
		LinkedList meow = new LinkedList();
		System.out.println(meow);
		
		// add First
		meow.addFirst("hello");
		System.out.println(meow);
		meow.addFirst("byebye");
		System.out.println(meow);
		
		// add Last
		meow.addLast("nope");
		System.out.println(meow);
		
		System.out.println(meow.equals(shopping));
    }
}
