public class UserOfCoin {
	// test multi-flip
		System.out.println("\n before multi-flipping...");
		System.out.println( bruce);

		// start with a small number, to aid checking
		double headsFraction = bruce.flip( 2);  
		System.out.println("After multi-flipping...");
		System.out.println( bruce);
		System.out.println( "heads ratio: " + headsFraction);
		
		// increase flips by orders of magnitude
		headsFraction = bruce.flip( 20);  
		System.out.println("After multi-flipping...");
		System.out.println( bruce);
		System.out.println( "heads ratio: " + headsFraction);
		
		headsFraction = bruce.flip( 200);  
		System.out.println("After multi-flipping...");
		System.out.println( bruce);
		System.out.println( "heads ratio: " + headsFraction);
		
		headsFraction = bruce.flip( 200000);  // pc doesn't care
		System.out.println("After multi-flipping...");
		System.out.println( bruce);
		System.out.println( "heads ratio: " + headsFraction);
}