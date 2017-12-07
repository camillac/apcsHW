public class UserOfCoin {
  public static void main( String[] args ) {
      

    // ====  future work ====
    
	
    //test constructor and toString, using a valid name
    Coin bruce = new Coin( "penny", 0.3 );
    System.out.println("bruce: " + bruce);

    //test another constructor
    Coin wayne = new Coin( "nickle", 0.7, "heads" );
    System.out.println("wayne: " + wayne);

    //test flip() method
    bruce.flip();
    wayne.flip();
    System.out.println("\nAfter flipping...");
    System.out.println("bruce: " + bruce);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( bruce.equals(wayne) ) 
        System.out.println( "a match!" );
    else
        System.out.println( "No match" );
	
	
    //====  end of "future work" ====
  } //end  of main()
} //end of class